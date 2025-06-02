class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        else {
            int a = 0, b = 0, c = 0;
        char[] order = new char[s.length()];
        int pos = 0;
        for(char i : s.toCharArray()) {
            if(a == 0 && i == ')') return false;
            else if(b == 0 && i == ']') return false;
            else if(c == 0 && i == '}') return false;
            else if(i == '(') {
                a++;
                order[pos++] = i;
            }
            else if(i == '[') {
                b++;
                order[pos++] = i;
            }
            else if(i == '{') {
                c++;
                order[pos++] = i;
            }
            else if(i == '}') {
                if(order[pos - 1] == '{') {
                    c--;
                    pos--;
                } else return false;
            } else if(i == ']') {
                if(order[pos - 1] == '[') {
                    b--;
                    pos--;
                } else return false;
            } else if(i == ')') {
                if(order[pos - 1] == '(') {
                    a--;
                    pos--;
                } else return false;
            }
        }
        if(a == 0 && b == 0 && c == 0) return true;
        else return false;
        }
    }
}
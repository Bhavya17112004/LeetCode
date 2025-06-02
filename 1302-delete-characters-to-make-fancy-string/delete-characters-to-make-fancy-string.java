class Solution {
    public String makeFancyString(String s) {
        char[] result = new char[s.length()];
        char a;
        int n=0;
        for(int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if((n>=2 && result[n-1]==a) && result[n-2]==a) {
                continue;
            }
            result[n++] = a;
        }
        return new String(result, 0, n);
    }
}
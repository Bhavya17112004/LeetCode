class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for(char c : s.toCharArray()) {
            int pos = c - 'a' + 1;
            num.append(pos);
        }
        int result = 0;
        for(int i = 0; i < k; i++) {
            result = 0;
            for(char n : num.toString().toCharArray()) {
                result += n - '0';
            }
            num = new StringBuilder(String.valueOf(result));
        }
        return result;
    }
}
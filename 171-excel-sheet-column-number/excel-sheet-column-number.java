class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int ch = (int)columnTitle.charAt(i) - 64;
            res = res*26 + ch;
        }
        return res;
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i = s.length() - 1; i >= 0; i--)
            if(s.charAt(i) != ' ') len++;
            else if(s.charAt(i) == ' ' && len == 0) continue;
            else break;
        return len;
    }
}
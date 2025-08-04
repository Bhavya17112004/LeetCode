class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char a, b;
        for (int i = 0; i < s.length() - 1; i++) {
            a = s.charAt(i);
            b = s.charAt(i+1);
            if (a > b) score += (a - b);
            else score += (b - a);
        }
        return score;
    }
}
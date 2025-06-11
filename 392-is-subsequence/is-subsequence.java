class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if (sl > tl) {
            return false;
        }
        if (sl == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < tl; i++) {
            if (t.charAt(i) == s.charAt(count)) {
                count++;
            }
            if (count >= sl) {
                return true;
            }
        }    
        return false;
    }
}
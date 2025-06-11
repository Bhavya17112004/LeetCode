class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        for (int i = 0; i < sb1.length(); i++) {
            while (i < sb2.length() && sb1.charAt(i) != sb2.charAt(i)) {
                sb2.deleteCharAt(i);
            }
            if (i >= sb2.length()) return false;
        }
        return true;
    }
}
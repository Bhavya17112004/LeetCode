class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        String low = s.toLowerCase();
        while(i < j) {
            while (i < j && !(Character.isLetterOrDigit(low.charAt(i)))) {
                i++;
            }
            while (i < j && !(Character.isLetterOrDigit(low.charAt(j)))) {
                j--;
            }
            if (low.charAt(i) != low.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
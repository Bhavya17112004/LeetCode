class Solution {
    public int findPermutationDifference(String s, String t) {
        int j = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            j = t.indexOf(s.charAt(i));
            if (j < i) sum += i - j;
            else sum += j - i;
        }
        return sum;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[58];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;            
        }
        boolean odd = false;
        for (int i : arr) {
            count += (i / 2) * 2;
            if (i % 2 != 0) odd = true;
        }
        return odd ? count + 1 : count;
    }
}
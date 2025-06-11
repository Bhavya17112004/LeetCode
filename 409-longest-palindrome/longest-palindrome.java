class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[58];
        int count = 0, i = 0;
        for (i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;            
        }
        int max = 0;
        for (i = 0; i < 58; i++) {
            if (arr[i] % 2 != 0) {
                if (max < arr[i]) {    
                    count += arr[i] - 1;
                    max = arr[i];
                } else count += arr[i] - 1;
            } else count += arr[i];
        }
        if (max > 0) count++;
        return count;
    }
}
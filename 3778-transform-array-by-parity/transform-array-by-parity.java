class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) result[right--] = 1;
        }
        return result;
    }
}
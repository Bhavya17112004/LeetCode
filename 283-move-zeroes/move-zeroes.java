class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, n = nums.length;
        int k = 0;
        while (i + k < n) {
            while (i + k < n && nums[i + k] == 0) k++;
            if (i + k < n) {
                nums[i] = nums[i + k];
                i++;
            }
        }
        while (i < n) nums[i++] = 0;
    }
}
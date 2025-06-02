class Solution {
    public static int binary(int[] nums, int target, int left, int right) {
        if(right - left == 1 || right == left) {
            if (nums[left] >= target) return left;
            else if(nums[right] >= target) return right;
            else return right + 1;
        }
        int mid = (right + left) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return binary(nums, target, mid, right);
        else return binary(nums, target, left, mid);
    }
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        return binary(nums, target, left, right);
    }
}
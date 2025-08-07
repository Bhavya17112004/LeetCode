class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[100], ans = new int[2];
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (count[nums[i]] == 0) count[nums[i]]++;
            else if (count[nums[i]] != 0) ans[j++] = nums[i];
            if (j == 2) return ans;
        }
        return ans;
    }
}
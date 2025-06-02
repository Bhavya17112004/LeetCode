class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, m = 0, n = nums.length;
        while((i + m) < n) {
            while((i + m) < n && nums[i + m] == val) {
                m++;
            }
            if((i + m) < n) nums[i] = nums[i + m];
            else break;
            i++;
        }
        m = n - m;
        return m;
    }
}
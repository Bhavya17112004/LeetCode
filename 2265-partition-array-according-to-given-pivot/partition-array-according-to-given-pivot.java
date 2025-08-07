class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int pcount = 0;
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) result[j++] = nums[i];
            else if (nums[i] == pivot) pcount++;
        }
        while(pcount > 0) {
            result[j++] = pivot;
            pcount--;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) result[j++] = nums[i];
        }
        return result;
    }
}
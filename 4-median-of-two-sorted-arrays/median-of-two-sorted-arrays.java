class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k, i = 0, j = 0;
        if((m + n) % 2 != 0) {
            k = (m + n + 1) / 2;
            while(k > 1 && i < m && j < n) {
                if(nums1[i] <= nums2[j]) i++;
                else j++;
                k--;
            }
            while(i < m && k > 1) {
                i++;
                k--;
            }
            while(j < n && k > 1) {
                j++;
                k--;
            }
            if (i == m) return nums2[j];
            else if (j == n) return nums1[i];
            else return Math.min(nums1[i], nums2[j]);
        } else {
            int p, q;
            k = (m + n) / 2;
            while(k > 1 && i < m && j < n) {
                if(nums1[i] <= nums2[j]) i++;
                else j++;
                k--;
            }
            while(i < m && k > 1) {
                i++;
                k--;
            }
            while(j < n && k > 1) {
                j++;
                k--;
            }
            if(i == m) return (nums2[j] + nums2[j + 1]) / (float)2;
            else if(j == n) return (nums1[i] + nums1[i+ 1]) / (float)2;
            else {
                if(nums1[i] <= nums2[j]) p = nums1[i++];
                else p = nums2[j++];
                if(i == m) q = nums2[j];
                else if(j == n) q = nums1[i];
                else q = Math.min(nums1[i], nums2[j]);
                return (p + q) / (float)2;
            }
        }
    }
}
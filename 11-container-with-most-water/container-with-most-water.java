class Solution {
    public int maxArea(int[] height) {
        int maxa = 0;
        int right = height.length - 1;
        int left = 0;
        int area, minh;
        while(left < right) {
            minh = Math.min(height[left], height[right]);
            area = minh * (right - left);
            maxa = Math.max(maxa, area);
            if(height[left] < height[right]) {
                left++;
            } else right--;
        }
        return maxa;
    }
}
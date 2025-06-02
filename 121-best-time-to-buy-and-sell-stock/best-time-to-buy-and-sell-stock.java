class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0, mini = Integer.MAX_VALUE;
        for(int num : prices) {
            if (num < mini) mini = num;
            else diff = Math.max(diff, num - mini);
        }
        return diff;
    }
}
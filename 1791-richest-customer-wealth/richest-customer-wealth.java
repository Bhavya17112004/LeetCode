class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int currsum = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                currsum += accounts[i][j];
            }
            sum = Math.max(sum, currsum);
            currsum = 0;
        }
        return sum;
    }
}
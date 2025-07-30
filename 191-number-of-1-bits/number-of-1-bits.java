class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for (char a: binary.toCharArray()) {
            if (a == '1') count++;
        }
        return count;
    }
}
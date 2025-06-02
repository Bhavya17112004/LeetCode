class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int carry = 0;
        do {
            digits[i]++;
            if(digits[i] > 9) {
                carry = 1;
                digits[i] %= 10;
                i--;
            } else carry = 0;
        } while(carry > 0 && i >=0);
        if(carry == 0) return digits;
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for(i = 0; i < digits.length; i++) {
            result[i + 1] = digits[i];
        }
        return result;
    }
}
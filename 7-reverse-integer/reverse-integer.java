class Solution {
    public int reverse(int x) {
        int rev = 0;
        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE  / 10;
        while (x != 0) {
            int rem = x % 10;
            x /= 10;
            if (rev > max || (rev == max && rem > 7)) {
                return 0;
            }
            if (rev < min || (rev == min && rem < -8)) {
                return 0;
            }
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
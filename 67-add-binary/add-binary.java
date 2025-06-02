class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int sum = 0;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0) {
            sum = (int)a.charAt(i) + (int)b.charAt(j) + carry - 96;
            if(sum > 1) {
                carry = 1;
                sum -= 2;
            } else carry = 0;
            result.append((char)(sum+48));
            i--;
            j--;
        }
        while(i >= 0) {
            sum = (int)a.charAt(i) + carry - 48;
            if(sum > 1) {
                carry = 1;
                sum -= 2;
            } else carry = 0;
            result.append((char)(sum+48));
            i--;
        }
        while(j >= 0) {
            sum = (int)b.charAt(j) + carry - 48;
            if(sum > 1) {
                carry = 1;
                sum -= 2;
            } else carry = 0;
            result.append((char)(sum+48));
            j--;
        }
        if(carry > 0) result.append((char)(carry+48));
        StringBuilder finall = new StringBuilder();
        for(i = result.length()-1; i >= 0; i--) {
            finall.append(result.charAt(i));
        }
        return finall.toString();
    }
}
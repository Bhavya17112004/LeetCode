class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (char a : address.toCharArray()) {
            if (a == '.') result.append("[.]");
            else result.append(a);
        }
        return result.toString();
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            sb.append(curr);

            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2)) {
                countStack.push(countStack.peek() + 1);
            } else {
                countStack.push(1);
            }

            if (countStack.peek() == k) {
                sb.delete(sb.length() - k, sb.length());
                for (int j = 0; j < k; j++) countStack.pop();
            }
        }

        return sb.toString();
    }
}

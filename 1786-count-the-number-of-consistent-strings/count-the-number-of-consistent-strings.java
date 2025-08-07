class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int mask = 0;

        for (char c : allowed.toCharArray()) {
            mask |= 1 << (c - 'a');
        }

        for (String word : words) {
            boolean isValid = true;
            for (char c : word.toCharArray()) {
                if ((mask & (1 << (c - 'a'))) == 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) count++;
        }

        return count;
    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean cons = true;
        for (String s : words) {
            for (char a : s.toCharArray()) {
                cons = allowed.contains(String.valueOf(a));
                if (!cons) break;
            }
            if (cons) count++;
            cons = true;
        }
        return count;
    }
}
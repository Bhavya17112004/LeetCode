class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] c1 = new int[26], c2 = new int[26];
        int i = 0;
        while (i < ransomNote.length() || i < magazine.length()) {
            if (i < ransomNote.length()) c1[ransomNote.charAt(i) - 'a']++;
            if (i < magazine.length()) c2[magazine.charAt(i) - 'a']++;
            i++;
        }
        for(i = 0; i < 26; i++) {
            if (c2[i] - c1[i] < 0) return false;
        }
        return true;
    }
}
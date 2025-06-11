class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(char a : s.toCharArray()) arr[a - 'a']++;
        for(char a : t.toCharArray())
            if(--arr[a - 'a'] < 0) return a;
        return 'a';
    }
}
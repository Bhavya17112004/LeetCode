class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> PS = new HashMap<>();
        Map<String, Character> SP = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (PS.containsKey(ch)) {
                if (!PS.get(ch).equals(word)) return false;
            } else {
                if (SP.containsKey(word)) return false;
                PS.put(ch, word);
                SP.put(word, ch);
            }
        }

        return true;
    }
}
class Solution {
    private int[] parent = new int[26];

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        // Initialize parent array
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        // Union characters from s1 and s2
        for (int i = 0; i < s1.length(); i++) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';
            union(a, b);
        }

        // Build result using smallest equivalent characters
        StringBuilder result = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            int rep = find(c - 'a');
            result.append((char)(rep + 'a'));
        }

        return result.toString();
    }

    // Find with path compression
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Union with lexicographical priority
    private void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) return;

        if (px < py) {
            parent[py] = px;
        } else {
            parent[px] = py;
        }
    }
}

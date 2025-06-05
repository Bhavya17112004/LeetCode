class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based index
            int remainder = columnNumber % 26;
            result.append((char) (remainder + 'A'));
            columnNumber /= 26;
        }
        
        return result.reverse().toString();
    }
}

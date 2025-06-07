class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        String vowel = "aeiouAEIOU";
        while (i < j) {
            while (i < j && vowel.indexOf(arr[i]) == -1) {
                i++;
            }
            while (i < j && vowel.indexOf(arr[j]) == -1) {
                j--;
            }
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            i++;
            j--;
        }
        return new String(arr);
    }
}
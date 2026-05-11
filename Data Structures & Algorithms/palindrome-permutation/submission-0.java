class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] alt = new int[26];
        int oddCount = 0;

        for (char c : s.toCharArray()) {
            alt[c - 'a']++;
        }

        for (int i = 0; i < alt.length; i++) {
            if (alt[i] % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }
}

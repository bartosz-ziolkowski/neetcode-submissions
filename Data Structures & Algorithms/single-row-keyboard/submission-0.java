class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] keyIndices = new int[26];

        for (int i = 0; i < keyboard.length(); i++) {
            keyIndices[keyboard.charAt(i) - 'a'] = i;
        }

        int firstCharIndex = keyIndices[word.charAt(0) - 'a'];
        int res = Math.abs(0 - firstCharIndex);

        for (int i = 1; i < word.length(); i++) {
            res += Math.abs(keyIndices[word.charAt(i) - 'a'] - keyIndices[word.charAt(i - 1) - 'a']);
        }

        return res;
    }
}

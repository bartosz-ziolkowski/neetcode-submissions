class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int idx1 = Integer.MAX_VALUE;
        int idx2 = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
            if (word1.equals(wordsDict[i])) {
                idx1 = i;
                diff = Math.min(diff, Math.abs(idx1 - idx2));
            } else if (word2.equals(wordsDict[i])) {
                idx2 = i;
                diff = Math.min(diff, Math.abs(idx1 - idx2));
            }
        }

        return diff;
    }
}
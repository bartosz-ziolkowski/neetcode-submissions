class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int idx1 = Integer.MAX_VALUE;
        int idx2 = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                idx1 = i;
                diff = Math.min(diff, Math.abs(idx1 - idx2));
            }

            if (wordsDict[i].equals(word2)) {
                idx2 = i;
                diff = Math.min(diff, Math.abs(idx1 - idx2));
            }
        }

        return diff;
    }


}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int index1 = 0;
        int index2 = 0;

        final int word1len = word1.length();
        final int word2len = word2.length();

        while (index1 < word1len && index2 < word2len) {
            result
                .append(word1.charAt(index1))
                .append(word2.charAt(index2));
            index1++;
            index2++;
        }

        if (index1 < word1len) {
            result.append(word1.substring(index1));
        }

        if (index2 < word2len) {
            result.append(word2.substring(index2));
        }


        return result.toString(); 
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int sizeToTrack = word1.length() > word2.length() ? word2.length() : word1.length();
        // shorter string
        String res = "";
        for (int i = 0; i < sizeToTrack; i++) {
            res += word1.charAt(i);
            res += word2.charAt(i);
        }
        if (word1.length() > word2.length()) {
            for (int i = sizeToTrack; i < word1.length(); i++) {
            res += word1.charAt(i);
        }
        } else {
            for (int i = sizeToTrack; i < word2.length(); i++) {
            res += word2.charAt(i);
        }
        }
        return res;
    }
}
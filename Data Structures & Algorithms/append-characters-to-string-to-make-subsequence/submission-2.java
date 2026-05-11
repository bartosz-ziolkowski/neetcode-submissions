class Solution {
    public int appendCharacters(String s, String t) {
        int indexS = 0, indexT = 0;

        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexT++;
            } 
            indexS++;
        }

        return t.length() - indexT;
    }
}
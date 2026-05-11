class Solution {
    public int appendCharacters(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        int n = s.length();
        int m = t.length();
        
        while (indexS < n && indexT < m) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexT++; 
            }
            indexS++; 
        }
        
        return m - indexT;    
    }
}
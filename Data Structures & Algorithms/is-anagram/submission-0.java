class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Character, Integer> freqMapSec = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            freqMapSec.put(t.charAt(i), freqMapSec.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (char c : freqMap.keySet()) {
            if (!freqMap.get(c).equals(freqMapSec.get(c))) {
                return false;
            }
        }
        return true;
    }
}
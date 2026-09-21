class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
        }

        int l = 0;
        int count = 0;
        int needed = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (mp.containsKey(c)) {
                if (mp.get(c) > 0) {
                    count++;
                }
                mp.put(c, mp.get(c) - 1);
            }

            while (count == needed) {
                if (minLen > r - l + 1) {
                    minLen = r - l + 1;
                    start = l;
                }
                char leftChar = s.charAt(l);
                if (mp.containsKey(leftChar)) {
                    mp.put(leftChar, mp.get(leftChar) + 1);
                    if (mp.get(leftChar) > 0) count--;
                }
                l++;
            }
        }
        return start == -1 ? "" : s.substring(start, start+ minLen);
    }
}

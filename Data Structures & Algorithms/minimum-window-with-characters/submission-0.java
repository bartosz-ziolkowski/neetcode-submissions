class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int count = 0;
        int needed = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (freq.containsKey(c)) {
                if (freq.get(c) > 0) {
                    count++;
                }
                freq.put(c, freq.get(c) - 1);
            }

            while (count == needed) {
                if (minLen > r - l + 1) {
                    minLen = r - l + 1;
                    start = l;
                }

                char firstC = s.charAt(l);
                if (freq.containsKey(firstC)) {
                    freq.put(firstC, freq.get(firstC) + 1);
                    if (freq.get(firstC) > 0) {
                        count--;
                    }
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

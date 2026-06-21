class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int length = 0;

        for (int r = 0; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
                l = r;
            } else {
                set.add(s.charAt(r));
                length = Math.max(length, r - l + 1);
            }
        }

        return length;
    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int res = words.length;
        for (String w : words) {
            for (char c : w.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currChar = pattern.charAt(i);
            String currWord = words[i];

            if (map.containsKey(currChar)) {
                if (!words[map.get(currChar)].equals(currWord)) {
                    return false;
                }
            } else {
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (words[entry.getValue()].equals(currWord)) {
                        return false;
                    }
                }
                map.put(currChar, i);
            }
        }

        return true;
    }
}
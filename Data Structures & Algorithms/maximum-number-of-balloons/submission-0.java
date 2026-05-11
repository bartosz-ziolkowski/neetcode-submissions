class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            if ("balon".indexOf(c) != -1) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        if (freq.size() < 5) {
            return 0;
        }

        freq.put('l', freq.get('l') / 2);
        freq.put('o', freq.get('o') / 2);

        return Collections.min(freq.values());

    }
}
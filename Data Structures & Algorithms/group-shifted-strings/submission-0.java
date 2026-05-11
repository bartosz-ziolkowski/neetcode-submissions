class Solution {

    String getHash(String s) {
        char[] chars = s.toCharArray();
        StringBuilder hashKey = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            hashKey.append((char) ((chars[i] - chars[i - 1] + 26) % 26 + 'a'));
        }

        return hashKey.toString();
    }

    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strings ) {
            String hashKey = getHash(str);
            if (map.get(hashKey) == null) {
                map.put(hashKey, new ArrayList<>());
            }
            map.get(hashKey).add(str);
        }


        return new ArrayList<>(map.values());

    }
}

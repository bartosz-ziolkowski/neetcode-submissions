class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] chars = new int[26];
            for (char c : strs[i].toCharArray()) {
                chars[c - 'a']++;
            }
            String mapKey = Arrays.toString(chars);
            res.putIfAbsent(mapKey, new ArrayList<String>());
            res.get(mapKey).add(strs[i]);
            
        }

        return new ArrayList<>(res.values());
    }
}

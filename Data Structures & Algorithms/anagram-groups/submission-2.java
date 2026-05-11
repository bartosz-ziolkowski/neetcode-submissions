class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();
        for (String str : strs) {
            char[] res = new char[26];
            for (int i = 0; i < str.length(); i++) {
                res[str.charAt(i) - 'a']++;
            }

            String strKey = Arrays.toString(res);
            answer.putIfAbsent(strKey, new ArrayList<>());
            answer.get(strKey).add(str);
        }
        return new ArrayList<>(answer.values());
    }
}

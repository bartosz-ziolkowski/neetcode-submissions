class Solution {

    public String encode(List<String> strs) {
        // Lits.of(str1, str2, str3);
        StringBuilder decoded = new StringBuilder("");
        for (int i = 0; i < strs.size() - 1; i++) {
            decoded.append(strs.get(i)).append('@');
        }
        return decoded.append(strs.get(strs.size() - 1)).toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if (str.length() == 0) res.add("");
        int s = 0, r = 0;

        while (r < str.length()) {
            while (r < str.length() && str.charAt(r) != '@') {
                r++;
            }

            res.add(str.substring(s, r));
            s = ++r;
            r++;
        }

        return res;
    }
}

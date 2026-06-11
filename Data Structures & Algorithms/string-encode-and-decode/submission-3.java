class Solution {

    public String encode(List<String> strs) {
        StringBuilder decoded = new StringBuilder("");
        for (int i = 0; i < strs.size(); i++) {
            decoded.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
        return decoded.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if (str.length() == 0) res.add("");
        int s = 0, r = 0;
        while (r < str.length()) {
            while (r < str.length() && str.charAt(r) != '#') {
                r++;
            }

            // 4#neet4#code

            int len = Integer.parseInt(str.substring(s, r));
            s = ++r;
            r = len + s;
            res.add(str.substring(s, r));
            s = r++;
        }

        return res;
    }
}

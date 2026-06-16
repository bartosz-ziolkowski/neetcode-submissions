class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> vals = new HashMap<>();
        vals.put('I', 1);
        vals.put('V', 5);
        vals.put('X', 10);
        vals.put('L', 50);
        vals.put('C', 100);
        vals.put('D', 500);
        vals.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && vals.get(s.charAt(i)) < vals.get(s.charAt(i + 1))) {
                res -= vals.get(s.charAt(i));
            } else {
                res += vals.get(s.charAt(i));
            }
        }

        return res;
    }
}
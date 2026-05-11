class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) return false;
        int len = nums.length;
        int elPair = len / (len / 2);
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> pair : freq.entrySet()) {
            if (pair.getValue() % elPair != 0) {
                return false;
            }
        }

        return true;
    }
}
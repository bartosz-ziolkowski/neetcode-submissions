class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int res = -1;
        for (Map.Entry<Integer, Integer> pair : freq.entrySet()) {
            if (pair.getValue() == 1 && pair.getKey() > res) {
                res = pair.getKey();
            }
        }

        return res;
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) > nums.length / 3) {
                res.add(key);
            }
        }

        return res;
    }
}
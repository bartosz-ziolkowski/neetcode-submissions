class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;

        for (int num : nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() > n / 3) {
                arr.add(entry.getKey());
            }
        }

        return arr;
    }
}
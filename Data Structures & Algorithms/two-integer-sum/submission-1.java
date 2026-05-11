class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compMap = new HashMap<>();
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (compMap.containsKey(complement)) {
                return new int[] {compMap.get(complement), i};
            }
            compMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> toComplement = new HashMap();
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (toComplement.containsKey(complement)) {
                return new int[]{toComplement.get(complement), i};
            }
            toComplement.put(nums[i], i);
        }
        return new int[]{};
    }
}

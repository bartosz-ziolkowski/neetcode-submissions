class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        int toComplement = 0;

        for (int i = 0; i < nums.length; i++) {
            toComplement = target - nums[i];
            if (res.containsKey(toComplement)) {
                return new int[]{res.get(toComplement), i};
            }
            res.put(nums[i], i);
        }
        return null;
    }
}

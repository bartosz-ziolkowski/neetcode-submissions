class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (count < 0) {
                res = nums[i];
            }
            int diff = res == nums[i] ? 1 : -1;
            count += diff;
        }

        return res;
    }
}
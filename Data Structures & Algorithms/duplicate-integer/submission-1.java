class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                return true;
            }
            freqMap.put(num, 1);
        }
        return false;
    }
}
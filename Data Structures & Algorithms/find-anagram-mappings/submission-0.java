class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> pos = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            pos.put(nums2[i], i);
        }

        int[] res = new int[nums2.length];
        for(int i = 0; i < res.length; i++) {
            res[i] = pos.get(nums1[i]);
        }

        return res;
    }
}

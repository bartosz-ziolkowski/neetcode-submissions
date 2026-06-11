class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // 3 -> 3, 1 -> 1, 2 -> 2

        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            heap.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[0];
        }

        return res;
    }
}

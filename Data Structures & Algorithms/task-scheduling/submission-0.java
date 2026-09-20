class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i: freq) {
            if (i > 0) maxHeap.offer(i);
        }

        int res = 0;

        while (!maxHeap.isEmpty()) {
            int taskCycle = 0;
            int cycle = n + 1;

            List<Integer> list = new ArrayList<>();

            while (cycle > 0 && !maxHeap.isEmpty()) {
                int task = maxHeap.poll();
                if (task > 1) list.add(task - 1);

                taskCycle++;
                cycle--;
            }

            for (int el: list) {
                maxHeap.offer(el);
            }

            res += maxHeap.isEmpty() ? taskCycle : n + 1;
        }
        return res;
    }
}

class Job {
    int startTime;
    int endTime;
    int profit;

    public Job(int startTime, int endTime, int profit) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }
}

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Job> jobs = new ArrayList<>();

        for (int i = 0; i < startTime.length; i++) {
            jobs.add(new Job(startTime[i], endTime[i], profit[i]));
        }

        Collections.sort(jobs, (a, b) -> a.endTime - b.endTime);

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        int res = 0;

        // so in treemap we store: endTime -> profit (or max profit)

        for (Job currJob: jobs) {
            Integer jobEndsTillStartTime = mp.floorKey(currJob.startTime);
            int maxProfitTillStartTime = jobEndsTillStartTime == null ? 0 : mp.get(jobEndsTillStartTime);
            res = Math.max(res, maxProfitTillStartTime + currJob.profit);
            mp.put(currJob.endTime, res);
        }

        return res;
    }
}
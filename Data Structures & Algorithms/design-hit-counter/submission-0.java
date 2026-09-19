class HitCounter {

    private List<Integer> timestamps = new ArrayList<>();

    public HitCounter() {

    }
    
    public void hit(int timestamp) {
        timestamps.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        int leftBoundaryIndex = binarySearchLeftmost(timestamp - 300 + 1);
        return timestamps.size() - leftBoundaryIndex;
    }

    private int binarySearchLeftmost(int target) {
        int left = 0;
        int right = timestamps.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (timestamps.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */

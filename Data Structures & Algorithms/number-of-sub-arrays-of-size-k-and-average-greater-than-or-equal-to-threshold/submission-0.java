class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0, res = 0, sum = 0;
        int target = k * threshold;

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];

            if (r - l + 1 == k) {
                if (sum >= target) {
                    res++;
                }

                sum -= arr[l];
                l++;
            }
        }

        return res;
    }
}
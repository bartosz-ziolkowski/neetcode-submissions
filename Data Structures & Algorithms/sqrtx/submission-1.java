class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = 0;

        while (left <= right) {
            int m = left + (right - left) / 2;
            if ((long) m * m > x) {
                right = m - 1;
            } else if ((long) m * m < x) {
                left = m + 1;
                res = m;
            } else {
                return m;
            }
        }
        return res;
    }
}
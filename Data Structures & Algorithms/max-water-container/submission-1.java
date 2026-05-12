class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int res = 0;

        while (l < r) {
            int currVal = (r - l) * Math.min(heights[l], heights[r]);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }

            res = Math.max(res, currVal);
        }

        return res;
    }
}

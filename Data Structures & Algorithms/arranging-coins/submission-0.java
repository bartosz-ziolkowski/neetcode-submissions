class Solution {
    public int arrangeCoins(int n) {
        int k = 1;
        int res = 0;
        while (n > 0) {
            if (n < k) {
                break;
            }
            n -= k;
            k++;
            res++;
        }

        return res;
    }
}


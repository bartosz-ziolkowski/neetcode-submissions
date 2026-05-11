class Solution {
    public int[] replaceElements(int[] arr) {
        int value = -1;
        int[] res = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--) {
            res[i] = value;
            value = Math.max(arr[i], value);
        }

        return res;
    }
}
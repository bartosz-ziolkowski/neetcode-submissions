class Solution {
    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> elements = new HashSet<>();
        for (int num : arr) {
            elements.add(num);
        }

        for (int num : arr) {
            if (elements.contains(num + 1)) {
                count++;
            }
        }

        return count;
    }
}

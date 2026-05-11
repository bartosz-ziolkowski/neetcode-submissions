class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (String opr : operations) {
            if (opr.equals("D")) {
                int val = stack.peek();
                stack.push(2 * val);
            } else if (opr.equals("C")) {
                stack.pop();
            } else if (opr.equals("+")) {
                int c1 = stack.pop();
                int c2 = stack.peek();
                stack.push(c1);
                stack.push(c1 + c2);
            } else {
                stack.push(Integer.parseInt(opr));
            }
        }

        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
}
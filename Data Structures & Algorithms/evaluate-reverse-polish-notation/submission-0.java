class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> elements = new Stack<>();
        int result = 0;
        for(String str : tokens) {
            if (str.equals("+")) {
                elements.push(elements.pop() + elements.pop());
            } else if (str.equals("-")) {
                int a = elements.pop();
                int b = elements.pop();
                elements.push(b - a);
            } else if (str.equals("/")) {
                int a = elements.pop();
                int b = elements.pop();
                elements.push(b / a);
            } else if (str.equals("*")) {
                elements.push(elements.pop() * elements.pop());
            } else {
                elements.push(Integer.parseInt(str));
            }
        }
        return elements.pop();
    }
}

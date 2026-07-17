import java.util.Stack;

class MinStack {

    Stack<Integer> st;
    Stack<Integer> st1;

    public MinStack() {
        st = new Stack<>();
        st1 = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if (st1.isEmpty() || value <= st1.peek()) {
            st1.push(value);
        }
    }

    public void pop() {
        if (st.peek().equals(st1.peek())) {
            st1.pop();
        }

        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return st1.peek();
    }
}
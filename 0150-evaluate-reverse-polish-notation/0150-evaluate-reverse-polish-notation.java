class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<t.length;i++){           
            if(t[i].length()==1&&(t[i].charAt(0)=='+'||t[i].charAt(0)=='-'||t[i].charAt(0)=='*'||t[i].charAt(0)=='/')){
                int a=st.pop();
                int b=st.pop();
                switch(t[i].charAt(0)){
                    case '+': st.push(b+a);
                    break;
                    case '-': st.push(b-a);
                    break;
                    case '*': st.push(b*a);
                    break;
                    case '/': st.push(b/a);
                    break;
                 }
            }else st.push(Integer.parseInt(t[i]));
        }
        return st.peek();
    }
}
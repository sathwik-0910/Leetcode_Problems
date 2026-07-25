class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<o.length;i++){
            if(o[i].charAt(0)=='+'||o[i].charAt(0)=='D'||o[i].charAt(0)=='C'){
                if(o[i].charAt(0)=='+'){
                    int t=st.pop();
                    int res = st.peek()+t;
                    st.push(t);
                    st.push(res);
                }else if(o[i].charAt(0)=='D'){
                    st.push(st.peek()*2);
                }else st.pop();
            }else st.push(Integer.parseInt(o[i]));
        }
        int r=0;
        while(!st.isEmpty()){
            r+=st.pop();
        }
        return r;
    }
}

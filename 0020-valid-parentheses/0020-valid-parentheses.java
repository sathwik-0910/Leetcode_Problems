class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        st.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            int f=0;
            if(!st.isEmpty()){
                if(st.peek()=='('&&s.charAt(i)==')'){
                    st.pop();
                    f=1;
                }
                else if(st.peek()=='{'&&s.charAt(i)=='}') {
                    st.pop();
                    f=1;
                }
                else if(st.peek()=='['&&s.charAt(i)==']') {
                    f=1;
                    st.pop();
                }
            } if(f==0) st.push(s.charAt(i));
        }
        return st.isEmpty();
    }
}
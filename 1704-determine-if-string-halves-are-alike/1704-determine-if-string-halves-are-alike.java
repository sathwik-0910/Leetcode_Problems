class Solution {
    public boolean halvesAreAlike(String s1) {
        int c1=0,c2=0;
        String s=s1.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                if(i<s.length()/2)c1++;
                else c2++;
            }
        }
        return c1==c2;
    }
}
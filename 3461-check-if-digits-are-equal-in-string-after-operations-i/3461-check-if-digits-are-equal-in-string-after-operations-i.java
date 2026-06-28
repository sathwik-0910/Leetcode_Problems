class Solution {
    public boolean same(String s1){
        
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)!=s1.charAt(i+1)) return false;
        }
        return true;
    }
    public boolean hasSameDigits(String s) {
        String s1="";
        if (s.length() <= 1)
            return true;
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        } 
        for(int i=0;i<s.length()-1;i++){
           s1+= ((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
        }
        if(same(s1)) return true;
        return hasSameDigits(s1);
    }
}
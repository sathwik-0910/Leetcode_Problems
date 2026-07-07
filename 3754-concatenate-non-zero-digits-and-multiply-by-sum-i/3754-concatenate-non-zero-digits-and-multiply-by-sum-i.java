class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        long sum=0;
        String s=""+n;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                int t=(int)(s.charAt(i)-'0');
                ans=ans*10+t;
                sum+=t;
            }
        }
        return ans*sum;
    }
}
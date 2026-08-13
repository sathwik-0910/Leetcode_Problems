class Solution {
    public String thousandSeparator(int n) {
        String s=""+n;
        if(n==0) return "0";
        StringBuilder sb = new StringBuilder();
        int c=0;
        while(n!=0){
            sb.append(n%10);
            n/=10;
            c++;
            if(c%3==0)sb.append(".");
        }
        sb.reverse();
        if(sb.length()>=1&&sb.charAt(0)=='.')sb.deleteCharAt(0);
        return sb.toString();
    }
}
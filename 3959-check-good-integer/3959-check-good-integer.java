class Solution {
    public boolean checkGoodInteger(int n) {
        int s=0,ss=0;
        while(n!=0){
            int rem = n%10;
            s+=rem;
            ss+=(rem*rem);
            n/=10;
        }
        return ss-s>=50;
    }
}
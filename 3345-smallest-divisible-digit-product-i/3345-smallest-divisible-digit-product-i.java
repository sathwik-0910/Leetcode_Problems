class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(true){
            if(i>100) break;
            int pro=1;
            int p=i;
            while(p!=0){
                pro*=(p%10);
                p/=10;
            }
            if(pro%t==0) return i;
            else i++;
        }
        return -1;
    }
}
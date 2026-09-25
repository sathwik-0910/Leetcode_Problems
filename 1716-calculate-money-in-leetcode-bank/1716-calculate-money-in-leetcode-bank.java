class Solution {
    public int totalMoney(int n) {
        int i=1;
        int sum=0;
        int m1=1;                           
        int t=m1;                
        while(i<=n){                     
            sum+=m1;
            m1++;
            
            if(i%7==0){
                t++;
                m1=t;
            }

            i++; 
        }
        return sum;
    }
}
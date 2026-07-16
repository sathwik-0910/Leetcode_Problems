class Solution {
    public long gcd(long a , long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int []mx = new int[nums.length];
         int[]pf = new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                mx[i]=max;
            }else mx[i]=max;
            pf[i]=(int)gcd(nums[i],mx[i]);
        }
        Arrays.sort(pf);
        long sum=0;
        int i=0,j=pf.length-1;
        while(i<j){
            sum+=gcd(pf[i],pf[j]);
            i++;
            j--;
        }
        return sum;
    }
    
}
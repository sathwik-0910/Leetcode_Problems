class Solution {
    public int findGCD(int[] nums) {
        int min1=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min1){
                min1 = nums[i];
            }
        }int ans=0;
        for(int i=1;i<=Math.min(max,min1);i++){
            if(max%i==0&&min1%i==0) ans=i;
        }
        return ans;
    }
}
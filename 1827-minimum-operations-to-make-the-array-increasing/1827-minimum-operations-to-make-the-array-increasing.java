class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                int s = nums[i-1]-nums[i]+1;   
                nums[i]+=s;                       
                c+=s;
            }
        }
        return c;
    }
}
class Solution {
    public int[] replaceElements(int[] nums) {
        int []arr = new int[nums.length];
        int max=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                arr[i]=max;
                max=Math.max(nums[i],max);
            }else{
                arr[i]=max;
                max=Math.max(max,nums[i]);
            }
        }
        return arr;
    }
}
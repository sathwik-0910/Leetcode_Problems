class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int i=1;
        int f=0;
        while(i<nums.length){
            if(nums[i-1]!=nums[i]){
                if(f==1){
                    nums[k]=nums[i];
                }
                i++;
                k++;
            }else{
                f=1;
                i++;
            }
        }                                 //[1,2,3,3,3,4,4,4,5,5];
                                                 //  k
        return k;
                                        //5
    }
}
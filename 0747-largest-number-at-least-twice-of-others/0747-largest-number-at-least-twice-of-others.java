class Solution {
    public int dominantIndex(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MAX_VALUE;

        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(m1 == nums[i] || m2 == nums[i]) continue;

            if(nums[i]>m1){
                ind = i;
                m2 = m1;
                m1 = nums[i];
            }

            if(nums[i]>m2 && nums[i]<m1) m2 = nums[i];
        }
        if((m2*2)<=m1) return ind;
        return -1; 
    }
}
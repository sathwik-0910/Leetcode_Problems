class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        while(k!=0){
            c+=nums[nums.length-1];
            k--;
            nums[nums.length-1]++;
        }
        return c;
    }
}
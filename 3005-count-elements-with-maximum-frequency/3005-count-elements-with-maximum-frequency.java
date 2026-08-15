class Solution {
    public int maxFrequencyElements(int[] nums) {
        int hash[] = new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }int max=0;
        for(int i=0;i<101;i++){
            max=Math.max(max,hash[i]);
        }int c=0;
        for(int i=0;i<101;i++){
            if(max==hash[i])c+=hash[i];
        }
        return c;
    }
}
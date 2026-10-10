class Solution {
    public int differenceOfSum(int[] nums) {
     int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            String s=""+nums[i];
            for(int j=0;j<s.length();j++){
                s2+=(s.charAt(j)-'0');
            }
        }   
        return Math.abs(s1-s2);
    }
}
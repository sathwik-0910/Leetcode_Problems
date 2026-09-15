class Solution {
    public boolean checkIfExist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(list.contains(nums[i]/2)||list.contains(nums[i]*2)) return true;
                else list.add(nums[i]);
            }
            else{
                list.add(nums[i]);
                if(list.contains(nums[i]*2)) return true;
            } 
        }
        return false;
    }
}
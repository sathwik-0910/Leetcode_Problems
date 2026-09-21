class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){  //  0 1 2 3 4 5 6 7
        int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
             nums[index] *= -1;
        }
    }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0) list.add(j+1);
        }
        return list;
    }
}
class Solution {

    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            set.add(nums[i]);

            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));

            sb.reverse();

            int p = Integer.parseInt(sb.toString());

            set.add(p);
        }

        return set.size();
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }

       for(int i=0;i<nums2.length;i++){
        if(list1.contains(nums2[i])) list2.add(nums2[i]);
       }
       int []res = new int[list2.size()];
       int i = 0;
        for (int num : list2) {
            res[i] = num;
            i++;
        }

        return res;
    }
}
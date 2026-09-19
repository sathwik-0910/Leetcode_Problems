class Solution {
    public int findLucky(int[] arr) {
        int []hash = new int[501];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(hash[arr[i]]==arr[i]){
                max = Math.max(max,arr[i]);
            }
        }

        return max;
    }
}
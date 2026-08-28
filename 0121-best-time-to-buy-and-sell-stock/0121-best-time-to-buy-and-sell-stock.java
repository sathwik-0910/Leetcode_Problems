class Solution {
    public int maxProfit(int[] arr) {
        if(arr.length==1) return 0;
        int bb = arr[0];
        int mp=-1;
        for(int i=1;i<arr.length;i++){
            bb=Math.min(arr[i],bb);
            mp=Math.max(arr[i]-bb,mp);
            

        }
        return mp;
    }
}
class Solution {
    public int[] getFinalState(int[] arr, int k, int m) {
        while(k-->0){
            int min=arr[0];
            int ind=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                    ind=i;
                }
            }
            arr[ind]*=m;
        }
        return arr;
    }
}
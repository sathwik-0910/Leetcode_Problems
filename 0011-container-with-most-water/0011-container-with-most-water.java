class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int max=0;
        int area=0;
        while(i<=j){
            area = (j-i) * Math.min(arr[i],arr[j]);
            max = Math.max(max,area);
            if(arr[i]<=arr[j]){
                i++;
            }else j--;
        }
        return max;
    }
}
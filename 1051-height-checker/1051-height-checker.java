class Solution {
    public int heightChecker(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=copy[i])c++;
        }
        return c;
    }
}
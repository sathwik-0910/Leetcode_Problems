class Solution {
    public int[] findDegrees(int[][] mat) {
        int []arr = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum+=mat[i][j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}
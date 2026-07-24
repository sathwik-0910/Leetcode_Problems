class Solution {
    public int countCompleteDayPairs(int[] h) {
        int c=0;
        for(int i=0;i<h.length;i++){
            for(int j=0;j<h.length;j++){
                if(i<j&&(h[i]+h[j])%24==0) c++;
            }
        }
        return c;
    }
}
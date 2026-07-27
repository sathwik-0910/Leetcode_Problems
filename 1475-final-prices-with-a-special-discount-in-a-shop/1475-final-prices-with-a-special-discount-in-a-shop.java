class Solution {
    public int[] finalPrices(int[] p) {
        int []s = new int[p.length];
        for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){
                if(p[j]<=p[i]){
                    s[i]=p[i]-p[j];
                    break;
                }else s[i]=p[i];
            }
        }
        s[p.length-1]=p[s.length-1];
        return s;
    }
}
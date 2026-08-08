class Solution {
    public int mostWordsFound(String[] s) {
        int c=0;
        for(int i=0;i<s.length;i++){
            String []arr = s[i].split(" ");
            c=Math.max(c,arr.length);
        }
        return c;
    }
}
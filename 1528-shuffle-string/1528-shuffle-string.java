class Solution {
    public String restoreString(String s, int[] in) {
        char []a = new char[s.length()];
        for(int i=0;i<in.length;i++){
            a[in[i]]=s.charAt(i);
        }
        return new String(a);
    }
}

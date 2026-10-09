class Solution {
    public int maxDifference(String s) {
        int []hash = new int[26];
        for(int i = 0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;                      
        }
        int e = Integer.MAX_VALUE,o = 0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]!=0&&hash[i]%2==0) e = Math.min(hash[i],e);
            else if(hash[i]!=0) o = Math.max(hash[i],o);         
        }

        return o-e;
    }
}
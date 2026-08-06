class Solution {
    public char repeatedCharacter(String s) {
        int []c = new int[26];
        for(int i=0;i<s.length();i++){
            if(c[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }else c[s.charAt(i)-'a']++;
        }
        return '%';
    }
}
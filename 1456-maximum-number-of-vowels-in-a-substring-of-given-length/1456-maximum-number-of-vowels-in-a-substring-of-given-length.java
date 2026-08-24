class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int count=0;
        int max=0;
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            int f=0;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
                f=1;
            }
            if(j-i+1>=k){
                 max = Math.max(count,max);
                char p = s.charAt(i);
                if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'){
                    count--;
                }
                i++;
            }
        }
        return max;
    }
}
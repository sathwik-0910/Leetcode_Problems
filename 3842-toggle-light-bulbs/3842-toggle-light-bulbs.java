import java.util.*;
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> b) {
        int []hash = new int[101];
        for(int i=0;i<b.size();i++){
            hash[b.get(i)]++;
        }
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<101;i++){
           if( hash[i]%2!=0) list.add(i);
        }
        return list;
    }
}
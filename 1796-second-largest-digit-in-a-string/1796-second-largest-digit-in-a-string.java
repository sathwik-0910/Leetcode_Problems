import java.util.*;
class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))list.add(s.charAt(i)-'0');
        }
        if(list.size()==0) return -1;
        int l=list.get(0);
        int sl=-1;
        for(int i=1;i<list.size();i++){
            if(list.get(i)>l){
                sl=l;
                l=list.get(i);
            }else if(list.get(i)<l&&list.get(i)>sl){
                sl=list.get(i);
            }
        }
        return sl;
    }
}

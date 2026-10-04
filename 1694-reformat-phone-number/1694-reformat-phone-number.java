class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for ( int i = 0 ; i < number.length() ; i++ ){
            if(number.charAt(i)==' '||number.charAt(i)=='-') continue;
            else{
                c++;
                sb.append(number.charAt(i));
                if(c%3==0)
                    sb.append('-');
                }
            }
        
        if(sb.charAt(sb.length()-1)=='-')sb.deleteCharAt(sb.length()-1);
        if(sb.charAt(sb.length()-2)=='-'){
            char t = sb.charAt(sb.length()-3);
            sb.setCharAt(sb.length()-3,sb.charAt(sb.length()-2));
            sb.setCharAt(sb.length()-2,t);
        }
        return sb.toString();
    }
}
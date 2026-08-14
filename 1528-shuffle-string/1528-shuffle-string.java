class Solution {
    public String restoreString(String s, int[] p) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < p.length; i++) {
            sb.setCharAt(p[i], s.charAt(i));
        }

        return sb.toString();
    }
}
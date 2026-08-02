class Solution {
    public int countStudents(int[] st, int[] sa) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < st.length; i++) {
            sb1.append(st[i]);
            sb2.append(sa[i]);
        }

        int rotations = 0;

        while (sb1.length() > 0) {
            if (sb1.charAt(0) == sb2.charAt(0)) {
                sb1.deleteCharAt(0);
                sb2.deleteCharAt(0);
                rotations = 0; // reset because one student ate
            } else {
                sb1.append(sb1.charAt(0));
                sb1.deleteCharAt(0);
                rotations++;
            }

            if (rotations == sb1.length()) {
                break;
            }
        }

        return sb1.length();
    }
}
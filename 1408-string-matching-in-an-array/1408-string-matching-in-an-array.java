class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {

            for(int j = 0; j < words.length; j++) {

                if(i != j) {

                    if(words[j].contains(words[i])) {

                        int f = 0;

                        for(int k = 0; k < list.size(); k++) {
                            if(words[i].equals(list.get(k))) {
                                f = 1;
                            }
                        }

                        if(f == 0) {
                            list.add(words[i]);
                        }

                        break;
                    }
                }
            }
        }

        return list;
    }
}
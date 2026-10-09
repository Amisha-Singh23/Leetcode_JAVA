class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        java.util.List<String> result = new java.util.ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();
            String row;

            char first = w.charAt(0);

            if (row1.indexOf(first) >= 0) {
                row = row1;
            } else if (row2.indexOf(first) >= 0) {
                row = row2;
            } else {
                row = row3;
            }

            int i = 0;

            while (i < w.length() && row.indexOf(w.charAt(i)) >= 0) {
                i++;
            }

            if (i == w.length()) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
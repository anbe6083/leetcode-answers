class Solution {
    public String reverseWords(String s) {
        if(s == null) return null;
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            for(int j = words[i].length() - 1; j >= 0; j-- ) {
                reversedWord.append(words[i].charAt(j));
            }
            words[i] = reversedWord.toString();
        }
        return String.join(" ", words);
    }
}
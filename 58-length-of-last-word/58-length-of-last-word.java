class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        String lastWord = word[word.length-1];
        
        return lastWord.length();
         
    }
}
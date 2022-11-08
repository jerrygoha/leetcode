class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        
        HashSet<Character> hs = new HashSet<Character>();
        
        for (int i = 0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                result++;
            }else{
                hs.add(s.charAt(i));
            }            
        }
        
        if(hs.size()>0){
            return result*2 + 1;
        }
        
        return result*2;
        
    }
}
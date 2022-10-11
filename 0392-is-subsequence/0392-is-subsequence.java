class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int idxS = 0;
        int idxT = 0;
        
        while(idxT < t.length() && idxS < s.length()){
            if(s.charAt(idxS) == t.charAt(idxT)){
                idxS++;
                idxT++;
            }else{
                idxT++;
            }
        }
        
        if(idxS == s.length()){
            return true;
        }else{
            return false;
        }
        
    }
}
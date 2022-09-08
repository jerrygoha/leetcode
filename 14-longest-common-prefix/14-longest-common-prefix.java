class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if(strs[0] == ""){
            return "";
        }
        
        String defaultString = strs[0];
        
        for (int i = 0; i < defaultString.length(); i++){
            for (String str: strs){
                if(str == ""){
                    return "";
                }
                
                if(str.length() < i+1){
                    return prefix.toString();
                }
                
                if(false == Character.toString(str.charAt(i)).equals(Character.toString(defaultString.charAt(i)))){
                    return prefix.toString();
                }
            }
            prefix.append(String.valueOf(defaultString.charAt(i)));
        }
        
        return prefix.toString();
        
    }
}
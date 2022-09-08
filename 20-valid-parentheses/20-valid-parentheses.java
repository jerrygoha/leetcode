class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> brackets = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                brackets.push(s.charAt(i));
            }else{
                if(brackets.size() == 0){
                    return false;
                }
                
                if((int)brackets.peek() == (int)s.charAt(i)-1 || (int)brackets.peek() == (int)s.charAt(i)-2){
                    brackets.pop();
                }else{
                    return false;
                }
            }
        }
        
        if (brackets.size() == 0){
            return true;
        }
        
        return false;
        
        
    }
}
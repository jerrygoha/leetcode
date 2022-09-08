class Solution {
    public boolean isPalindrome(int x) {
        
        int num = x;
        //문자열로 변환 후 Stringbuilder에 넣고 뒤집은 후 비교
        if(num < 0){
            return false;
        }
       
        if(num == 0){
            return true;
        }
        
        if(num%10 == 0){
            return false;
        }

        String inputNum = String.valueOf(num);
        
        StringBuilder sbInputNum = new StringBuilder();
        StringBuilder rvInputNum = new StringBuilder();
        
        sbInputNum.append(inputNum);
        rvInputNum = sbInputNum.reverse();  
        
        if (true == inputNum.equals(rvInputNum.toString())){
            return true;
        }
        
        return false;
        
    }
}
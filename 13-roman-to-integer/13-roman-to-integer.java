class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNum = new HashMap<Character, Integer>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
        
        int result = 0;
        char[] charInput = s.toCharArray();
        
        for (int i = 0; i<charInput.length-1; i++){
            
            if( romanNum.get(charInput[i]) < romanNum.get(charInput[i+1]) ){
                result -= romanNum.get(charInput[i]);
            }else{
                result += romanNum.get(charInput[i]);
            }
        }
        
        result += romanNum.get(charInput[charInput.length-1]);
        
        return result;
    }
}
import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger aNum = new BigInteger(a, 2);
        BigInteger bNum = new BigInteger(b, 2);
        
        BigInteger sumNum = aNum.add(bNum);
        
        return sumNum.toString(2);
    }
}
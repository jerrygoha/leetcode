class Solution {
    static int maxPow3 = (int) Math.pow(3, 19);

    public boolean isPowerOfThree(int n) {
        // 3^19 =1162261467, 
        // 3^20 는 정수 범위를 초과한다. 
        return ( n>0 &&  maxPow3%n==0);
    }
}
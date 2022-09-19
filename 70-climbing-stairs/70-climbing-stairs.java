class Solution {
    public int climbStairs(int n) {
                //전체 범위
        int[] result = new int[46];

        result[0] = 0;
        result[1] = 1;
        result[2] = 2;

        for(int i = 3; i<=n; i++){
            result[i] = result[i-1] + result[i-2];
        }
        
        return result[n];
    }
}
class Solution {
    public int fib(int n) {
        int[] r = new int[31];
        r[0] = 0;
        r[1] = 1;
        
        if (n == 0 || n == 1){
            return n;
        }
        
        r[n] = fib(n-2) + fib(n-1);
        
        return r[n];
        
    }
}
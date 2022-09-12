class Solution {
    public int mySqrt(int x) {
        if (x < 2){
            return x;
        }
        
        int low = 1;
        int high = x/2;
        int mid = 0;
        int result = 0;
        
        while(low<=high){
            mid = (low+high)/2;
            long multiple = mid * (long)mid;
            
            if(multiple == x){
                return mid;
            }
            
            else if(multiple < x){
                low = mid + 1;
                result = mid;
            }
            
            else {
                high = mid - 1;
            }
        }
        
        return result;
        
    }
}
class Solution {
    public int mySqrt(int x) {
        
        if (x <= 1){
          return x;  
        }
        
        int start = 1;
        int end = x/2;
        
        while(start < end) {
            // start가 변하지 않는 경우, 무한루프에 갇힐 수 있음.
            // 항상 mid를 변경시키기 위해 매 루프마다 mid +1 해줌
            int mid = (start + (end-start)/2) + 1;
            
            // 오버플로우를 피하기 위해 나눗셈 사용
            int div = x/mid;
            
            if(div == mid){
              return mid;  
            }
            
            if(div > mid){
              start = mid;  
            } else{
              end = mid-1;  
            } 
        }
        
        return start;
    }
}
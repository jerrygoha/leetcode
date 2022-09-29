class Solution {
    public int pivotIndex(int[] nums) {
        /*  
        1. 전체 합계를 구한다
        2. 0번부터 순차적으로 올라가면서, 전체 합계 - 해당 인덱스 값 에서 2를 나눈 값이 현재까지의 합산과 같은지 비교한다.
        3. 따로 해당하는 값이 없다면 -1 반환
        */
        
        int totalSum = 0;
        int tempSum = 0;
        
        for(int value : nums){
            totalSum += value;
        }
        
        for(int i = 0; i<nums.length; tempSum += nums[i++]){
            
            if(tempSum * 2 == totalSum - nums[i]){
                return i;
            }
            
        }
        
        return -1;
        
    }
}
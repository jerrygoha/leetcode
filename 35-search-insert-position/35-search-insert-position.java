class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int midIdx = 0;
        
        while(low<=high){
            midIdx = (low+high) / 2;
            
            if(nums[midIdx]==target){
                return midIdx;
            }
            
            if(nums[midIdx]<target){
                low = midIdx + 1;
            }
            
            if(target<nums[midIdx]){
                high = midIdx - 1;
            }
        }
        
        return low;
    }
}
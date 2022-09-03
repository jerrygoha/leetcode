class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int secondNum = 0;
        
        for (int i = 0; i<nums.length; i++){
            secondNum = target - nums[i];
            if(true == map.containsKey(secondNum)){
                result[0] = map.get(secondNum);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
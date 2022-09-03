class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> tempHash = new HashSet<Integer>();
        for(int num: nums){
            if(tempHash.contains(num)){
                return true;
            }
            tempHash.add(num);
        }
        return false;
    }
}
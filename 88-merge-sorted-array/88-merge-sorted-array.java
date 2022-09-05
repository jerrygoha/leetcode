class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Length = m-1;
        int nums2Length = n-1;
        int mergedLength = m+n-1;
        
        while (0 <= nums2Length){
            if(0<=nums1Length && nums1[nums1Length] > nums2[nums2Length]){
                nums1[mergedLength] = nums1[nums1Length];
                mergedLength--;
                nums1Length--;
            }else{
                nums1[mergedLength] = nums2[nums2Length];
                mergedLength--;
                nums2Length--;
            }
        }
    }
}
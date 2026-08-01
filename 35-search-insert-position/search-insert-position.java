class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length ;
        int i=0, j=n ;
        while(i<j){
            int k = i + (j-i)/2 ;
            if(nums[k] >= target){
                j = k ;
            }else{
                i = k+1 ;
            }
        }
        return i ;
    }
}
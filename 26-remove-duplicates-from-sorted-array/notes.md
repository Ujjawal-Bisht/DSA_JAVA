In interview start with the brute force approach *O(n) T.C.* and *O(n) S.C.* then move to the better solution and at last tell the optimal solution.

# Brute Force:
```
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> dArray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dArray.contains(nums[i])) { // dArray.contains(nums[i]) is O(k) where k is current size of dArray.
                dArray.add(nums[i]);
            }
        }

        for (int i = 0; i < dArray.size(); i++) {
            nums[i] = dArray.get(i);
        }

        return dArray.size();
    }
}
```
## T.C. - O(n^2)
## S.C. - O(n)

# Better Solution
```
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1 ;
        while(j<nums.length) {
            if(nums[i] == nums[j]){
                j++ ;
            }else{
                int temp = nums[i+1] ;
                nums[i+1] = nums[j] ;
                nums[j] = temp ;
                i++ ; j++ ;
            }
        }
        return i+1 ;
    }
}
```
## T.C. - O(n)
## S.C. - O(1)

# Optimal Solution
```
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=1 ;
        while(j<nums.length) {
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j] ;
                i++ ;
            }
            j++ ;
        }
        return i+1 ;
    }
}
```
## T.C. - O(n)
## S.C. - O(1)
### Note: Same complexity but lesser operations.

class Solution {
    public int maximumProduct(int[] nums) {
        int l1 = -1001, l2 = -1001, l3 = -1001 ;
        int s1 = 1001, s2 = 1001 ;

        for(int x:nums){
            if(x>l1){
                l3 = l2 ; l2 = l1 ;
                l1 = x ;
            }else if(x>l2 && x<=l1){
                l3 = l2 ;
                l2 = x ;
            }else if(x>l3 && x<=l2){
                l3 = x ;
            }

            if(x < s1){
                s2 = s1 ;
                s1 = x ;
            }else if(x < s2 && x >= s1){
                s2 = x ;
            }
        }
        return Math.max(l1*l2*l3, s1*s2*l1) ;
    }
}
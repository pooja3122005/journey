class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
           int min=Integer.MAX_VALUE;
        //    int n = nums1.length<nums2.length?nums2.length:nums1.length;

        int ind1=0;
        int ind2=0;
        while(ind2<nums2.length && ind1<nums1.length){
            if(nums1[ind1]==nums2[ind2])
            {
                if(nums1[ind1]<min)
                min=nums1[ind1];
                ind1++;
                ind2++;
            }
            else if(nums1[ind1]<nums2[ind2])
            ind1++;
            else
            ind2++;
           }
           return min==Integer.MAX_VALUE?-1:min;
    }
}
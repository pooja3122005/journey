class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> res = new HashSet<>();
        for(int num:nums2){
            if(!set.contains(num))
               set.add(num);
        }
        for(int nums : nums1)
        {
            if(set.contains(nums))
             res.add(nums);
        }
        int[] final_res = res.stream().mapToInt(i->i).toArray();
        return final_res;
    }
}
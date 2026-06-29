class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // HashSet <Integer> set = new HashSet<>();
        // HashSet <Integer> res = new HashSet<>();
        // for(int num:nums2){
        //     if(!set.contains(num))
        //        set.add(num);
        // }
        // for(int nums : nums1)
        // {
        //     if(set.contains(nums))
        //      res.add(nums);
        // }
        // int[] final_res = res.stream().mapToInt(i->i).toArray();
        // return final_res;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set= new HashSet<>();
    	int index1=0;
    	int index2=0;
    	while(index1<nums1.length && index2<nums2.length ) {
    		if(nums1[index1]==nums2[index2]) {
    			 set.add(nums2[index2]);
    			index2++;
    			index1++;
    		}
    		else if(nums1[index1] <nums2[index2])
    		index1++;
    		else
    			index2++;
    	}
    	return Arrays.stream(set.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int end=0;
        // int start =0;
        // int sum=0;
        // double max_avg=Double.NEGATIVE_INFINITY;
        // while(end<nums.length){
        //     sum += nums[end];
        //     if((end-start)+1==k){
        //         double avg=(double)sum/k;
        //         max_avg=Math.max(max_avg,avg);
        //         sum=sum-nums[start];
        //         start++;
        //     }
        //     end++;
        // }
        // return max_avg;

          int start =0;
         int end=0;
         
         double sum =0;
         double max_avg = Double.NEGATIVE_INFINITY;
         
         while(end<nums.length) {
        	 sum+=nums[end];
        	 if(k<(end-start+1)) {
        		 sum-=nums[start];
        		 start++;
        	 }
        	 if(k==(end-start)+1) {
        		 double avg = sum/k;
        		 max_avg=Math.max(max_avg, avg);
        		 }
        	 end++;
         }
         return max_avg;
    }
}
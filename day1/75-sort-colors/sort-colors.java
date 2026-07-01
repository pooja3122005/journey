class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        int middle = 0;

        while (middle <= end) {
            switch (nums[middle]) {
                case 0:
                    int temp = nums[start];
                    nums[start] = nums[middle];
                    nums[middle] = temp;
                    start++;
                    middle++;
                    break;
                case 1:
                    middle++;
                    break;

                case 2:
                    int temp1 = nums[middle];
                    nums[middle] = nums[end];
                    nums[end] = temp1;
                
                    end--;
                    break;

            }
        }
    }

    // wrong method using two pointers it pass few test cases
    // while (start < end) {
    //     if (nums[start] == 1 && nums[end] == 1) {
    //         start++;
    //         end--;
    //     }
    //     //   if(nums[start]!=0&&nums[end]!=2 && nums[start]!=nums[end]){
    //     if (nums[start] > nums[end]) {

    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;

    //     }
    //     start++;
    //     end--;
    // }
    // }

}
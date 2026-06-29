class Solution {
    public int maxArea(int[] height) {
     int l=0;
     int r=height.length-1;
     int max_area=Integer.MIN_VALUE;
     while(l<r){
        int width = r-l;
        int h=Math.min(height[l],height[r]);
        max_area=Math.max(max_area,width*h);
        if(height[l]<height[r])
        l++;
        else
        r--;
     }
     return max_area;
    }
}
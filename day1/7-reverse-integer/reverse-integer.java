class Solution {
    public int reverse(int x) {
        int num =x;
        int result =0;
        while(num!=0){
            int digits = num%10;
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && digits>7))
            return 0;
            if(result<Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && digits<-8))
            return 0;
            result = result*10 + digits;
          num= num/10;
        
        }
        return result;

        
    }
}
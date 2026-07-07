class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long res =0;
        long sum =0;

         for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i)-'0';
                if(digit!=0) {
                    sum+=digit;
                    res=(res*10)+digit;
                }
            }
         }
           return res*sum;
    }
}
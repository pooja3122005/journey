class Solution {
    public String reverseWords(String s) {
         String[] words = s.split("\\s+");
        for(int i=0;i<words.length;i++) {
        	words[i]=reverse(words[i]);
        }
      
        return String.join(" ", words);
        
    }
	public static String reverse(String s) {
		char[] arr=s.toCharArray();
		int l =0;
		int r=s.length()-1;
		while(l<r) {
			char temp = arr[l];
			arr[l] = arr[r];
			arr[r]=temp;
			l++;
			r--;
			
		}
		return String.valueOf(arr);
	}
}
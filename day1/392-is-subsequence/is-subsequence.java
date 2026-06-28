class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=0;
	int tIndex=0;
	int count=0;
	
	while(index<s.length() && tIndex<t.length()) {
		if(s.charAt(index)==t.charAt(tIndex)) {
			count++;
			index++;
		}
		tIndex++;
	}
     return count==s.length();   
    }
}
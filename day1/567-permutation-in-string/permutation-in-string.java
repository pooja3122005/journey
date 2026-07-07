class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<String> set = new HashSet<>();
        // boolean flag = false;
        set.add(s1.chars().sorted().mapToObj(c ->String.valueOf((char) c)).collect((Collectors.joining())));
        StringBuilder s = new StringBuilder();
        int right=0;
        int left=0;
        while(right<s2.length()){
            s.append(s2.charAt(right));
           if(s.length()>s1.length() ){
             s.deleteCharAt(0);
            
           }

            if(s.length()==s1.length()){
                  if(set.contains(s.chars().sorted().mapToObj(c ->String.valueOf((char) c)).collect((Collectors.joining())))) return true;
            }
           right++;

        }
       return false;
    }
}
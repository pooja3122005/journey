class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 ="";
         Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#') {
                if(!stack1.isEmpty()) stack1.pop();
            }
            else
               stack1.push(s.charAt(i));
        }
        for(char ch:stack1 ){
            s1+=ch;
        }
                 Stack<Character> stack2 = new Stack<>();
         String s2 ="";
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#') {
                                if(!stack2.isEmpty()) stack2.pop();

            }
            else
              stack2.push(t.charAt(i));

        }
        for(char ch : stack2) s2+=ch;
        return s1.equals(s2);
        
    }
}
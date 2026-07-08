class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char [] char_String = strs[i].toCharArray();
            Arrays.sort(char_String);
            String key_word = new String(char_String);
            map.computeIfAbsent(key_word,k-> new ArrayList<String>()).add(strs[i]);


        }
        return new ArrayList<>(map.values());    
        }
        
}

// eat
// tea
// ate
// a e t --- key--> values[eat,tea,ate]

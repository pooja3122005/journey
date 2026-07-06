class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        //  int[] freq = new int[256];
         int index=0;
        // for(int i=0;i<stones.length();i++){
        //     freq[stones.charAt(i)-'a']++;
        // }
        // for(int countF:freq){
        //   count+=countF;
        // }
      HashMap<Character,Integer> map = new HashMap<>();
      for(char c : stones.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }
      for(int i=0;i<jewels.length();i++){
        if(map.containsKey(jewels.charAt(i)))
         count+=  map.get(jewels.charAt(i));
      }
        return  count;
    }
}
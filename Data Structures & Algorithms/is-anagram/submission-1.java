class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char i : s.toCharArray()){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(char c: t.toCharArray()){
            if(!freqMap.containsKey(c)){
                return false;
            }
            
            freqMap.put(c, freqMap.get(c) - 1);

            if(freqMap.get(c) < 0){
                return false;
            }
        }
        return true;
    }
}

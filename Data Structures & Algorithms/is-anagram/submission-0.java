class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char i : s.toCharArray()){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(char i : t.toCharArray()){
            if (!freqMap.containsKey(i)) {
                return false;
            }
            
            freqMap.put(i, freqMap.get(i) - 1);

            if(freqMap.get(i) == 0){
                freqMap.remove(i);
            }

        }
        return freqMap.isEmpty();
    }
}

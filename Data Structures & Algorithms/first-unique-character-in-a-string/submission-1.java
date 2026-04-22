class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char i : s.toCharArray()){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(char i : s.toCharArray()){
            if(freqMap.get(i) == 1){
                return s.indexOf(i);
            }
        }
        return -1;
    }
}
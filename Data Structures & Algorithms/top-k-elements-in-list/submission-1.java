class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        
        for(int i: nums){
                freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        
         return freqMap.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}

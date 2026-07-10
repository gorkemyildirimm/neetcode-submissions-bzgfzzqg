class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap();
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(int i: nums){
            if(freqMap.get(i) > 1){
                return i;
            }
        }
        return 0;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(int i: nums){
            if(freqMap.get(i) > nums.length / 2){
                return i;
            }
        }

        return -1;
    }
}
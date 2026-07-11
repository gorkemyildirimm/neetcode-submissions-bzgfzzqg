class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap();

        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        int index = 0;

        for (int color = 0; color <= 2; color++) {
            int frequency = freqMap.getOrDefault(color, 0);

            for (int i = 0; i < frequency; i++) {
                nums[index] = color;
                index++;
            }
        }
    }
}
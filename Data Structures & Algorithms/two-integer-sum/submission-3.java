class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            seenMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(seenMap.containsKey(diff) && seenMap.get(diff) != i){
                return new int[]{i, seenMap.get(diff)};
            }
        }
        return new int[]{};
    }
}

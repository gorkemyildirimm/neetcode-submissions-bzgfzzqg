class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbersWithPositions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (numbersWithPositions.containsKey(diff)) {
                return new int[]{numbersWithPositions.get(diff), i};
            }

            numbersWithPositions.put(num, i);
        }
        return new int[]{};
    }
}

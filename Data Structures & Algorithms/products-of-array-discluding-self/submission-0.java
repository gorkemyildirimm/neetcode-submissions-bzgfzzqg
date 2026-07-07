class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] numbers = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            numbers[i] = 1;
            for(int j=0; j<nums.length; j++){
                if(i != j){
                    numbers[i] *= nums[j];
                }
            }
        }
        return numbers;
    }
}  

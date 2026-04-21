class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqs = new HashSet<>();

        for(int num:nums){
            if(uniqs.contains(num)){
                return true;
            }
            uniqs.add(num);
        }
        return false;
    }
}
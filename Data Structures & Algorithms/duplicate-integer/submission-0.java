class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dict = new HashSet<>();
    for (int i : nums) {
    if (dict.contains(i)) {
        return true;
    }
    dict.add(i);
}
return false;
    }
}

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;
        int counter = 0;

        int[] sortedArr = people;
        Arrays.sort(sortedArr);

        while(l<=r){
            if(sortedArr[r] + sortedArr[l] <= limit){
                l++;
            }

                r--;
                counter++;
            }
        return counter;
    }
}
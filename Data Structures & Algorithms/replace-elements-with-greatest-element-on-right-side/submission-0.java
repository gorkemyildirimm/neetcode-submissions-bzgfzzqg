class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
            max = Math.max(max, arr[j]);
            arr[i] = max;
            
            }
             if(i == arr.length - 1){
                arr[i] = -1;
            }

            max = 0;
        }
        return arr;
    }
}
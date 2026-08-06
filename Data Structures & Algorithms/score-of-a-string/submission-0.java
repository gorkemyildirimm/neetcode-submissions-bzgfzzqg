class Solution {
    public int scoreOfString(String s) {
        int l = 0;
        int r = l+1;
        int result = 0;

        while(r < s.length()){
            result += Math.abs(s.charAt(r) - s.charAt(l));
            l++;
            r++;
        }

        return result;
    }
}
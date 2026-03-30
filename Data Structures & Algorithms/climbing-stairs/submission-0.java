class Solution {
    public int climbStairs(int n) {
    if (n <= 1) {
        return 1;
    }
    // Recursive case: fib(n) = fib(n - 1) + fib(n - 2)
    return climbStairs(n-1) + climbStairs(n-2);
    }
}

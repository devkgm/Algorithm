class Solution {
    public long solution(int n) {
        long[] dp = new long[3];
        dp[0] = 1;
        dp[1] = 2;
        if(n == 1) return 1;
        if(n == 2) return 2;
        for(int i = 3; i <= n; i++) {
            dp[2] = (dp[0] + dp[1]) % 1234567;
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}
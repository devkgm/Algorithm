class Solution {
    public long fibonacci(int n) {
        if(n<=1) return n;
        
        long[] dp = new long[n+1];
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1234567L;
        }
        return dp[n];
    }
    public int solution(int n) {
        int answer = 0;
        answer = (int) (fibonacci(n));
        return answer;
    }
}
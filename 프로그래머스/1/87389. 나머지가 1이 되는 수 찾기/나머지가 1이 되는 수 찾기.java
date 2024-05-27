class Solution {
    public int solution(int n) {
        //작은 수 부터 나누기
        for(int i = 1; i <= n; i++){
            if(n % i == 1) return i;
        }
        return -1;
    }
}
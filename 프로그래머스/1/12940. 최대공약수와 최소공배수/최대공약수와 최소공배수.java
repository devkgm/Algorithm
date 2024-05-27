class Solution {
    public int gcb(int a, int b) {
        if (b == 0) return a;
        return gcb(b, a%b);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        answer[0] = gcb(max,min);
        answer[1] = max % min == 0 ? max : min * max / answer[0];
        return answer;
    }
}
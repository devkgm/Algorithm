class Solution {
    public int solution(int n) {
        int temp = Integer.bitCount(n);
        while(true) {
            if(Integer.bitCount(++n) == temp) return n;
        }
    }
}
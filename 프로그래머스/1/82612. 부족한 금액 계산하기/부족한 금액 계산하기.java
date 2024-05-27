class Solution {
    public long solution(int price, int money, int count) {
        long result = (long) (price * (1 + count) * (count / 2.0)) - money;
        return result > 0 ? result : 0;
    }
}
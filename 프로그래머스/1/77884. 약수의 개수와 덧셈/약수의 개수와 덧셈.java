class Solution {
    public int counter (int number) {
        int count = 1;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0) count ++;
        }
        return count;
    }
    public int solution(int left, int right) {
        int result = 0;
        for(int i = left; i <= right; i++){
            result += counter(i) % 2 == 0 ? i : -i;
        }
        return result;
    }
}
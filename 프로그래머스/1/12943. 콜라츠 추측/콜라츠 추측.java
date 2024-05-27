class Solution {
    public int solution(int num) {
        int count = 0;
        long test = num;
        while(true) {
            if(test == 1) return count;
            if(count >= 500) return -1;
            count++;
            test = test % 2 == 0 ? test / 2 : test * 3 + 1;
        }
    }
}
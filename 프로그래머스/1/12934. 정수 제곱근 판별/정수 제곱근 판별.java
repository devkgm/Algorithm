import java.util.*;
class Solution {
    public long solution(long n) {
        // 제곱근 구하기
        double num = Math.sqrt(n);
        // 소수점 유무 확인
        if(num == (long) num) {
            long result = (long) Math.pow(num+1, 2);
            return result;
        }
        return -1;
    }
}
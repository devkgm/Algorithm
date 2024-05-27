import java.util.*;
class Solution {
    public long solution(long n) {
        // 문자열로 변환
        String str = Long.toString(n);
        // 문자열 배열로 변환
        String[] strArr = str.split("");
        // 내림차순 정렬
        Arrays.sort(strArr, Collections.reverseOrder());
        // 문자열 배열 문자열로 결합
        str = String.join("", strArr);
        // 문자열 long타입으로 변환
        return Long.parseLong(str);
    }
}
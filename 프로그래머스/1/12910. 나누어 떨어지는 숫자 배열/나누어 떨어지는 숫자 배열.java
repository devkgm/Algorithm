import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 값 구하기
        List<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(num % divisor == 0) list.add(num);
        }
        // 없을 때 -1 리턴
        if(list.size() == 0) return new int[] {-1};
        // Integer List 타입 int배열로 변환 후 정렬
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
class Solution {
    public int[] solution(long n) {
        // 숫자를 문자로 변경
        String str = Long.toString(n);
        // 문자를 한 개씩 자르기
        int[] numArray = new int[str.length()];
        for (int i = 0 ; i < str.length(); i++){
            numArray[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return numArray;
    }
}
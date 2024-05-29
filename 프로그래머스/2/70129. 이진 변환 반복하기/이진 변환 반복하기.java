class Solution {
    public int[] solution(String s) {
        //01110 11 10 1
        int[] answer = new int[2];
        while(!s.equals("1")) {
            String str1 = s.replaceAll("0", "");
            answer[1] += s.length() - str1.length();
            String str2 = Integer.toBinaryString(str1.length());
            s = str2;
            answer[0]++;
        }
        return answer;
    }
}
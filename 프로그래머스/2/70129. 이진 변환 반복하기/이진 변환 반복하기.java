class Solution {
    public int[] solution(String s) {
        //01110 11 10 1
        int zeroCount = 0;
        int calcCount = 0;
        while(!s.equals("1")) {
            String str1 = s.replaceAll("0", "");
            zeroCount += s.length() - str1.length();
            String str2 = Integer.toBinaryString(str1.length());
            s = str2;
            calcCount++;
        }
        int[] result = {calcCount,zeroCount};
        return result;
    }
}
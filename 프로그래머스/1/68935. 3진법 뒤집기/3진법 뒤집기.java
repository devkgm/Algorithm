class Solution {
    public static String toThree(long number) {
        StringBuilder sb = new StringBuilder();
        while(true){
            if(number < 3) {
                sb.append(number);
                break;
            }
            sb.append(number % 3);
            number = number / 3;
        }
        return sb.toString();
    }
    public int toTen(String three) {
        int result = 0;
        char[] arr = three.toCharArray();
        for(int i = 0; i < arr.length; i++){
            result +=(arr[i] - '0') * Math.pow(3,(arr.length-1-i)) ;
        }
        return result;
    }
    public int solution(int n) {
        return toTen(toThree(n));
    }
}
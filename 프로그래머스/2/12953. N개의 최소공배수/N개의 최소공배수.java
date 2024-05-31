class Solution {
    public int gcb(int a, int b) {
        if (b == 0) return a;
        return gcb(b, a%b);
    }
    public int solution(int[] arr) {
        int temp = 1;
        for(int i = 0; i < arr.length; i++){
            temp =  arr[i] * temp / gcb(arr[i], temp);
        }
        return temp;
    }
}
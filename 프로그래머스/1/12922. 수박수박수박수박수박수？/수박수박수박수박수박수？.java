class Solution {
    public String solution(int n) {
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = i % 2 == 0 ? "수" : "박";
        }
        return String.join("", str);
    }
}
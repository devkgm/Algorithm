class Solution {
    public String solution(String s) {
        double mid = s.length() / 2.0;
        
        if(mid == (int) mid) return s.substring((int)mid-1,(int)mid+1);
        else return s.charAt((int)mid)+"";
    }
}
class Solution {
    public String solution(String s) {
        String[] str = s.toLowerCase().split(" ", -1);
        
        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(0) >= '0' && str[i].charAt(0) <= '9') continue;
            if(str[i].length() == 0) {
                str[i] = "$";
            }
            StringBuilder sb = new StringBuilder(str[i]);
            sb.setCharAt(0,Character.toUpperCase(str[i].charAt(0)) );
            str[i] = sb.toString();
        }
        return String.join(" ", str);
    }
}
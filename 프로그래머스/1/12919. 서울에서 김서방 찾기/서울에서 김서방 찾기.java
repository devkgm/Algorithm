import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        List strList = new ArrayList<>(Arrays.asList(seoul));
        return "김서방은 "+strList.indexOf("Kim")+"에 있다";
    }
}
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){
            if (i != 0 && list.get(list.size()-1) == arr[i]) continue;
            list.add(arr[i]);
        }
        int[] result = new int[list.size()];
        int i = 0;
        for(int num : list){
            result[i++] = num;
        }
        return result;
    }
}
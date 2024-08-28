import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        for(int[] arr : sizes) {
            Arrays.sort(arr);
            if(maxW < arr[0]) maxW = arr[0];
            if(maxH < arr[1]) maxH = arr[1];
        }
        return maxW * maxH;
    }
}
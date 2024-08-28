import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] student = new int[][]{{1, 2, 3, 4, 5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] score = new int[3];
        int maxScore = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < answers.length; j++) {
                if (answers[j] == student[i][j % student[i].length]) score[i]++;
            }
            maxScore = Math.max(score[i], maxScore);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(score[i] == maxScore) result.add(i+1);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
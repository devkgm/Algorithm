import java.util.LinkedList;
import java.util.Queue;

class Coordinate {
    int x = 0;
    int y = 0;
    int count = 0;

    Coordinate (int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
class Solution {
    public int solution(int[][] maps) {
        int[] movX = {1, 0, -1, 0};
        int[] movY = {0, 1, 0, -1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.offer(new Coordinate(0, 0, 1));
        int answer = -1;
        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == maps.length - 1 && c.y == maps[0].length - 1) {
                answer = c.count;
                break;
            }

            for (int i = 0; i < movX.length; i++) {
                int tmpX = c.x + movX[i];
                int tmpY = c.y + movY[i];

                if (tmpX >= 0 && tmpY >= 0 && tmpX < maps.length && tmpY < maps[0].length && maps[tmpX][tmpY] != 0) {
                    queue.offer(new Coordinate(tmpX, tmpY, c.count+1));
                    maps[tmpX][tmpY] = 0;
                }
            }
        }
        return answer;
    }
}

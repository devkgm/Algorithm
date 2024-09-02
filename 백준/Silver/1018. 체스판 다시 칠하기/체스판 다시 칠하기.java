import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        char[][] chars = new char[w][h];
        for (int i = 0; i < w; i++) {
            chars[i] = br.readLine().toCharArray();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= w - 8; i++) {
            for (int j = 0; j <= h - 8; j++) {
                min = Math.min(min, check(chars, i , j));
            }

        }
        System.out.println(min);
    }

    public static int check(char[][] board, int startX, int startY) {
        int repaints1 = 0;
        int repaints2 = 0;
        char[][] pattern1 = {{'W', 'B'}, {'B', 'W'}};
        char[][] pattern2 = {{'B', 'W'}, {'W', 'B'}};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[startX + i][startY + j] != pattern1[i % 2][j % 2]) {
                    repaints1++;
                }
                if (board[startX + i][startY + j] != pattern2[i % 2][j % 2]) {
                    repaints2++;
                }
            }
        }

        return Math.min(repaints1, repaints2);
    }
}

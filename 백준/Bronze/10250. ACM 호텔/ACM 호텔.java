import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len =Integer.parseInt(st.nextToken());
        for (int i = 0; i < len; i++){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;
            System.out.printf("%d%02d\n", floor, room);
        }
    }
}

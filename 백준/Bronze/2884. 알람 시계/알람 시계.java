import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = H * 60 + M;
        int total = 24 * 60;
        min -= 45;
        if ( min < 0) min = total + min;
        System.out.println(min / 60+ " " + min % 60);
    }
}

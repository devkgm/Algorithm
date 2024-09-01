import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int score = Integer.parseInt(st.nextToken());
        String rate = "F";
        if (score >= 60) rate = "D";
        if (score >= 70) rate = "C";
        if (score >= 80) rate = "B";
        if (score >= 90) rate = "A";
        System.out.println(rate);
    }

}

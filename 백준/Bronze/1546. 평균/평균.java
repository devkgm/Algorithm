import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Double> scores = new ArrayList<>();
        double max = 0;
        double sum = 0;
        while (st.hasMoreTokens()) {
            double num = Double.parseDouble(st.nextToken());
            max = Math.max(max, num);
            scores.add(num);
        }
        for (Double d : scores) {
            sum += d / max * 100;
        }
        System.out.println(sum / len);
    }
}

/*
121
1231
12421
0
*/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        int[] dp = new int[10001];
        for (int i = 0; i < len; i++) {
            dp[Integer.parseInt(br.readLine())]++ ;
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i]; j++) {
                bw.write(i+"");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}

/*
10
5
2
3
1
4
2
3
5
1
7
*/
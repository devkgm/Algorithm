import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 1 ; i <= a ; i++) {
            System.out.printf("%"+a+"s", "*".repeat(i));
            if (i != a) System.out.println();
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rep = Integer.parseInt(st.nextToken());
            char[] chars = st.nextToken().toCharArray();
            for (char c : chars) {
                System.out.print(String.valueOf(c).repeat(rep));
            }
            System.out.println();
        }
    }
}

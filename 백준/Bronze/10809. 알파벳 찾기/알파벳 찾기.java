import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        String[] res = new String['z' - 'a' + 1];
        for (int i = 0; i <= 'z' - 'a'; i++) {
            res[i] = String.valueOf(str.indexOf('a' + i));
        }
        System.out.println(String.join(" ", res));
    }
}

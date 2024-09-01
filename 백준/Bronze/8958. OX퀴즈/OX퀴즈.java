import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = null;
        br.readLine();
        while((str = br.readLine()) != null && !str.isEmpty()) {
            String[] arr = str.split("X");
            int res = 0;
            for(int i = 0 ; i < arr.length; i++) {
                if (arr[i].isEmpty()) continue;
                int len = arr[i].length();
                res += len * (len + 1) / 2;
            }
            System.out.println(res);
        }
    }
}

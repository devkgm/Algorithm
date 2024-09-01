import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        String str = null;
        int res = 0;
        while((str = br.readLine()) != null && !str.isEmpty()) {
            int num = Integer.parseInt(str) % 42;
            if (set.contains(num)) continue;
            set.add(num);
            res++;
        }
        System.out.println(res);
    }
}

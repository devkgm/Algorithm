import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(br.readLine());
        long b = Integer.parseInt(br.readLine());
        long c = Integer.parseInt(br.readLine());
        long mul = a * b * c;
        int[] res = new int[10];
        for(char ch : String.valueOf(mul).toCharArray()) {
            res[Integer.parseInt(String.valueOf(ch))]++;
        }
        for (int i : res) {
            System.out.println(i);
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long len = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < len; i++){
            long num = Long.parseLong(str[i]);
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println(min + " " + max);
    }
}

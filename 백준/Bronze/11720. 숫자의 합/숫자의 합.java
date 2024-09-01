import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len= Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < len; i++){
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);
    }
}

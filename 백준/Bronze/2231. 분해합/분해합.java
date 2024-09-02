import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            int sum = i;
            for(char c: chars) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            if (sum == num) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}

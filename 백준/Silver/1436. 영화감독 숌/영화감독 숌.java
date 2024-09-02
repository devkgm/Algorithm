import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 666; i < Integer.MAX_VALUE && num > 0; i++) {
            if (isSix(i)) num--;
            if(num == 0) System.out.println(i);
        }
    }
    public static boolean isSix(int num) {
        return String.valueOf(num).contains("666");
    }
}
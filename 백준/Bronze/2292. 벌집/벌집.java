import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(1);
            return;
        }
        int prev = 1;
        for (int i = 1; i < num; i++) {
            if ( num <= prev + i * 6) {
                System.out.println(i+1);
                break;
            }
            prev += i * 6;
        }
    }
}

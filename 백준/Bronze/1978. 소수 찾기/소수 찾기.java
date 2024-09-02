import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0; i < len; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) sum++;
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

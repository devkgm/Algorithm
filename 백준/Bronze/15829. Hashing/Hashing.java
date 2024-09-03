import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        long hash = 0;
        long pow = 1;
        for (int i = 0; i < len; i++) {
            int a = arr[i] - 'a' + 1;
            hash = (hash + a * pow) % 1234567891;
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(hash);
    }
}

/*
5
abcde
*/
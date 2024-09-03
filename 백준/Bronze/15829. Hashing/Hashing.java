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
        int hash = 0;
        for (int i = 0; i < len; i++) {
            hash += (int) ((arr[i] - 'a' + 1) * Math.pow(31, i));
        }
        System.out.println(hash);
    }
}

/*
5
abcde
*/
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (b > a) {
            System.out.println(0);
            return;
        }
        System.out.println(factorial(a) / (factorial(b) * factorial(a - b)));
    }

    public static int factorial(int a) {
        if (a <= 1) return 1;
        return a * factorial(a-1);
    }
}

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

        int gcb = gcb(Math.max(a, b), Math.min(a, b));
        System.out.println(gcb);
        System.out.println(a * b / gcb);
    }

    public static int gcb(int a, int b) {
        if (b == 0) return a;
        return gcb(b, a%b);
    }
}

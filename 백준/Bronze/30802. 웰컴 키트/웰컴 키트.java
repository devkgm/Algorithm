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
        int n = Integer.parseInt(br.readLine());
        int[] shirts = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < shirts.length; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int shirtsTotal = 0;
        for (int i = 0; i < shirts.length; i++) {
            shirtsTotal += shirts[i] / t + (shirts[i] % t > 0 ? 1 : 0);
        }
        System.out.println(shirtsTotal);
        System.out.println(n/p+" "+n%p);
    }
}

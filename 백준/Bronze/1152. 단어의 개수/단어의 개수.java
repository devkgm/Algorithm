import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = br.readLine().trim();
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
    }
}

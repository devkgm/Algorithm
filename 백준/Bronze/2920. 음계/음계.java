import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean flag = false;
        int temp = 0;
        boolean acc = false;
        boolean dec = false;
        while(st.hasMoreTokens()){
            if (temp == 0) {
                temp = Integer.parseInt(st.nextToken());
                continue;
            }
            int num = Integer.parseInt(st.nextToken());
            if (temp - num > 0) dec = true;
            else acc = true;
            temp = num;
        }
        System.out.println(acc && dec ? "mixed" : acc ? "ascending" : "descending");

    }
}

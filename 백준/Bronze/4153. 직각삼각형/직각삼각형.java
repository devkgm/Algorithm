import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            int[] arr = Arrays.asList(str.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            if(Math.pow(arr[0], 2)+Math.pow(arr[1],2) == Math.pow(arr[2],2))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}

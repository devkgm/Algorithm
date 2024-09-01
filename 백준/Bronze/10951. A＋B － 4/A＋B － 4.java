import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null && !str.isEmpty()){
            String[] arr = str.split(" ");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }

    }
}

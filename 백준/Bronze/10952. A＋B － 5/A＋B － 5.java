import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null && !str.isEmpty()){
            String[] arr = str.split(" ");
            if ("0".equals(arr[0]) && "0".equals(arr[1])) break;
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }

    }
}

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[] {br.readLine(), br.readLine(), br.readLine()};
        int num = 0;
        int next= 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains("zz") && num < Integer.parseInt(arr[i]) ) {
                num = Integer.parseInt(arr[i]);
                next = arr.length - i;
            }
        }
        String result = null;
        for (int i = num; i <= num + next; i++) {
            if (i % 3 == 0 && i % 5 ==0) result= "FizzBuzz";
            if (i % 3 == 0 && i % 5 != 0) result = "Fizz";
            if (i % 3 != 0 && i % 5 == 0) result = "Buzz";
            if (i % 3 != 0 && i % 5 != 0) result = i+"";
        }
        System.out.println(result);
    }

}

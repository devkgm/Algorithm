import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        for (int q = 0; q < len; q++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> init = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                init.add(i);
            }
            list.add(init);

            for (int i = 1; i < k; i++) {
                List<Integer> newList = new ArrayList<>();
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += list.get(i - 1).get(j);
                    newList.add(sum);
                }
                list.add(newList);
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += list.get(list.size() - 1).get(i);
            }
            System.out.println(sum);
        }
    }

}


/*

2
1
3
2
3

*/

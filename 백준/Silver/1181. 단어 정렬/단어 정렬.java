import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = null;
        Set<String> set = new HashSet<>();
        while((str = br.readLine()) != null && !str.isEmpty()) {
            set.add(str);
        }
        set.stream().sorted(((a, b) -> {
            if (a.length() == b.length())
                return a.compareTo(b);
             else
                return a.length() - b.length();
        })).forEach(
                System.out::println
        );
    }
}

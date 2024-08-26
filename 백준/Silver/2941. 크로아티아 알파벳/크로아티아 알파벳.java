import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution(Reader().get(0).trim());
    }

    public static void Solution(String str) {
        List<String> alphabets = List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        int result = 0;
        int i = 0;
        while (i < str.length()) {
            boolean found = false;
            for (int length = 3; length > 0; length--) {
                if (i + length <= str.length()) {
                    String substring = str.substring(i, i + length);

                    if (alphabets.contains(substring)) {
                        result++;
                        i += length;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                result++;
                i++;
            }
        }
        System.out.println(result);
    }

    public static List<String> Reader() {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            while ((str = br.readLine()) != null && !str.isEmpty()) {
                strings.add(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return strings;
    }
}

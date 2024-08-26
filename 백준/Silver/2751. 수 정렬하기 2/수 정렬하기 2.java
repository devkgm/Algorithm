import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = Reader();
        Solution(inputList.stream().map(Integer::parseInt).collect(Collectors.toList()));
    }

    public static void Solution(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        set.stream().sorted().forEach(System.out::println);
    }

    public static List<String> Reader() {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            br.readLine();
            while ((str = br.readLine()) != null && !str.isEmpty()) {
                strings.add(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return strings;
    }

    public static void Writer(String result) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(result);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

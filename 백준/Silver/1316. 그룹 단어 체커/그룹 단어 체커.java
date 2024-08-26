import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = Reader();
        String result = Solution(inputList);
        Writer(result);
    }

    public static String Solution(List<String> list) {
        int result = list.size();
        for (String str : list) {
            char[] characters = str.toCharArray();
            Set<Character> set = new HashSet<>();
            Character temp = null;
            for (char c : characters) {
                if (set.contains(c) && temp != c) {
                    result--;
                    break;
                } else {
                    set.add(c);
                    temp = c;
                }
            }
        }
        return String.valueOf(result);
    }

    public static List<String> Reader() {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            br.readLine(); // Assuming the first line is number of strings, but it's not used.
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

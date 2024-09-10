import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    private static final Set<Integer> fullSet = new HashSet<>();

    static {
        for (int i = 1; i <= 20; i++) {
            fullSet.add(i);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            int num;
            switch (com) {
                case "add":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    list.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(list.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (!list.add(num)) {
                        list.remove(num);
                    }
                    break;
                case "all":
                    list.clear();
                    list.addAll(fullSet);
                    break;
                case "empty":
                    list.clear();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}

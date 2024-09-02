import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    int x;
    int y;
    int rank;
    public Person(int x, int y, int rank) {
        this.x = x;
        this.y = y;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void out() {
        System.out.println(rank);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Person a = new Person(x, y, 1);
            list.add(a);
        }
        for (Person person : list) {
            for (Person com : list) {
                if (com.x > person.x && com.y > person.y) person.rank++;
            }
        }
        String result = list.stream()
                .map(person -> String.valueOf(person.getRank()))
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}

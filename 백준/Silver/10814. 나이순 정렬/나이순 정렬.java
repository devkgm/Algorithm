import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Person {
    int age;
    String name;
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void out() {
        System.out.println(age + " " + name);
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Person p = new Person(age, name);
            list.add(p);
        }
        list.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(Person::out);
    }
}

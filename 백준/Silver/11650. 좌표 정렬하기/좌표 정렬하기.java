import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Axis {
    int x;
    int y;
    public Axis(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void out() {
        System.out.println(x+" "+y);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        List<Axis> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Axis a = new Axis(x, y);
            list.add(a);
        }
        list.stream().sorted((a, b) -> {
            if (a.getX() == b.getX()) {
                return a.getY() - b.getY();
            } else {
                return a.getX() - b.getX();
            }
        }).forEach(Axis::out);
    }
}

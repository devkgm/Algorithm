import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        while ((str = br.readLine()) != null && !str.isEmpty() && !"0".equals(str)) {
            System.out.println(solution(str));
        }
    }

    public static String solution (String num) {
        if (num.startsWith("0")) return "no";
        int len = num.length() / 2 + num.length() % 2;
        for (int i = 0; i < len; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) return "no";
        }
        return "yes";
    }
}

/*
121
1231
12421
0
*/
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] withOutSelfNumber = new int[10001];
        for (int i =1; i <= 10000; i++) {
            int sum = i;
            for(char c: String.valueOf(i).toCharArray() ) {
                sum += c - '0';
            }
            if(sum <= 10000) 
                withOutSelfNumber[sum]++;
        }
        for (int i = 1; i <= 10000; i++) {
            if(withOutSelfNumber[i] == 0) System.out.println(i);
        }
    }
}

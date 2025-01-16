import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        TreeSet<Integer> uniqueNumbers = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            uniqueNumbers.add(Integer.parseInt(input[i]));
        }

        for (int num : uniqueNumbers) {
            sb.append(num).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

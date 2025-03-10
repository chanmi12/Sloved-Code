import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long x = Long.parseLong(br.readLine());
        long y = Integer.parseInt(br.readLine());

        if (x > 5) {
            System.out.println("Love is open door");
        } else {
            for (int i = 0; i < x - 1; i++) {
                if (y == 1) {
                    System.out.println("0");
                    y = 0;
                } else {
                   System.out.println("1");
                   y = 1;
               }
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 64;
        int y;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        while (y > 0) {
            if (x > y) {
                x = x / 2;
            } else {
                count++;
                y -= x;
            }
        }

        System.out.println(count);
    }
}

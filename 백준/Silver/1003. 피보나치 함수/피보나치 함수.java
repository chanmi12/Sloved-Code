import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        for (int i = 0; i < x; i++) {
            int n = scanner.nextInt();
            
            int num1 = 0;
            int num2 = 1;
            
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    num2 += num1;
                } else {
                    num1 += num2;
                }
            }
            
            if (n == 0) {
                System.out.println(1 + " " + 0);
            } else if (n % 2 == 0) {
                System.out.println(num2 + " " + num1);
            } else {
                System.out.println(num1 + " " + num2);
            }
        }
        
        scanner.close();
    }
}

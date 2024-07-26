import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < num; i++) {
            int count = 0;
            int total = 0;
            String str = scanner.nextLine(); 

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    total += ++count;
                } else {
                    count = 0;
                }
            }
            System.out.println(total);
        }

        scanner.close();
    }
}

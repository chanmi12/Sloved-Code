import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        final int MOD = 16769023;
        long sum = 2; // 초기 값 설정

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 1) {
                sum = (sum * 2) % MOD; // 홀수일 경우 2배
            }
        }
        
        System.out.println(sum);
    }
}

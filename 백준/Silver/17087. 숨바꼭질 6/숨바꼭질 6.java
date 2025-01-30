import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        
        int maxD = 0;
        for (int i = 0; i < N; i++) {
            maxD = Math.max(maxD, Math.abs(S - A[i]));
        }
        
        int result = maxD;
        for (int i = 0; i < N; i++) {
            result = gcd(result, Math.abs(S - A[i]));
        }
        
        System.out.println(result);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

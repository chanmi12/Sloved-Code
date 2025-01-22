import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ropes = new int[N];
        
        for (int i = 0; i < N; i++) {
            ropes[i] = scanner.nextInt();
        }
        
        Arrays.sort(ropes);  
        
        int maxWeight = 0;
        for (int i = 0; i < N; i++) {
            maxWeight = Math.max(maxWeight, ropes[i] * (N - i));
        }
        
        System.out.println(maxWeight);
    }
}

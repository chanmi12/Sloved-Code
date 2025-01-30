import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int m = scanner.nextInt();
        
        int decimalValue = 0;
        for (int i = 0; i < m; i++) {
            decimalValue = decimalValue * A + scanner.nextInt();
        }
        
        List<Integer> result = new ArrayList<>();
        while (decimalValue > 0) {
            result.add(decimalValue % B);
            decimalValue /= B;
        }
        
        Collections.reverse(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

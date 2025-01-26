import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        String expression = sc.nextLine();
        double[] values = new double[26];
        
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextDouble();
        }

        Stack<Double> stack = new Stack<>();
        
        for (char c : expression.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                stack.push(values[c - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.printf("%.2f\n", stack.pop());
        sc.close();
    }
}

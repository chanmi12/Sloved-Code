import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); 
        for (int i = 0; i < num1; i++) {
            int num2 = sc.nextInt();  
            int passengers = 0;  
            
            for (int j = 0; j < num2; j++) {
                passengers = passengers * 2 + 1;
            }
            
            System.out.println(passengers);
        }
    }
}

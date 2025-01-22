import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        long[] rotation = new long[num + 1];  
        int[] direction = new int[num + 1];   
        
        rotation[0] = 1; 
        direction[0] = 0; 
        
        for (int i = 0; i < num; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int s = sc.nextInt();
            
            long ratio = a * rotation[i] / b;
            rotation[i + 1] = ratio;
            
            if (s == 0) { 
                direction[i + 1] = direction[i];
            } else {  
                direction[i + 1] = 1 - direction[i];
            }
        }
        
        System.out.println(direction[num] + " " + rotation[num]);
    }
}

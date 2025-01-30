import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        StringBuilder binary = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            String bin = Integer.toBinaryString(num);
            if (i == 0) {
                binary.append(bin);
            } else {
                while (bin.length() < 3) {
                    bin = "0" + bin;
                }
                binary.append(bin);
            }
        }
        
        System.out.println(binary.toString());
    }
}

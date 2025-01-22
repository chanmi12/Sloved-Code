import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close(); 

        List<String> str1 = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            str1.add(S.substring(i));
        }

        Collections.sort(str1);

        for (String str2 : str1) {  
            System.out.println(str2);
        }
    }
}

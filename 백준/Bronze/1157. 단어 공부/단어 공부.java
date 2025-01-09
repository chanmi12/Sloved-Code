import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] f = new int[26];

        for (int i = 0; i < input.length(); i++) {
            f[input.charAt(i) - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (f[i] > max) {
                max = f[i];
                result = (char) (i + 'A');
            } else if (f[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
        sc.close();
    }
}

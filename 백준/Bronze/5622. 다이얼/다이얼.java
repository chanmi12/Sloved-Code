import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int totalSeconds = 0;

        for (char ch : word.toCharArray()) {
            if (ch >= 'A' && ch <= 'C') {
                totalSeconds += 3;
            } else if (ch >= 'D' && ch <= 'F') {
                totalSeconds += 4;
            } else if (ch >= 'G' && ch <= 'I') {
                totalSeconds += 5;
            } else if (ch >= 'J' && ch <= 'L') {
                totalSeconds += 6;
            } else if (ch >= 'M' && ch <= 'O') {
                totalSeconds += 7;
            } else if (ch >= 'P' && ch <= 'S') {
                totalSeconds += 8;
            } else if (ch >= 'T' && ch <= 'V') {
                totalSeconds += 9;
            } else if (ch >= 'W' && ch <= 'Z') {
                totalSeconds += 10;
            }
        }

        System.out.println(totalSeconds);

        sc.close();
    }
}

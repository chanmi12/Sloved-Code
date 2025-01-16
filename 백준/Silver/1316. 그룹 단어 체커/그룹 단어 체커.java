import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            boolean[] visited = new boolean[26];
            char prevChar = '\0';
            boolean judge = true;

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                if (currentChar != prevChar) {
                    if (visited[currentChar - 'a']) {
                        judge = false;
                        break;
                    }
                    visited[currentChar - 'a'] = true;
                    prevChar = currentChar;
                }
            }

            if (judge) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}

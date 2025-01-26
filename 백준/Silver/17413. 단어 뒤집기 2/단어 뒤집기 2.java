import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean insideTag = false;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '<') {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    word.setLength(0);
                }
                insideTag = true;
                result.append(c);
            } else if (c == '>') {
                insideTag = false;
                result.append(c);
            } else if (insideTag) {
                result.append(c);
            } else if (c == ' ') {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    word.setLength(0);
                }
                result.append(c);
            } else {
                word.append(c);
            }
        }

        if (word.length() > 0) {
            result.append(word.reverse());
        }

        System.out.println(result.toString());
        sc.close();
    }
}

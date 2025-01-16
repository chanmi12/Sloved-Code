import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v = "aeiou";

        while (true) {
            String pwd = sc.nextLine();

            if (pwd.equals("end")) {
                break;
            }

            boolean judge = false;
            int count1 = 0;
            int count2 = 0;
            char prev = '\0';
            boolean valid = true;

            for (char ch : pwd.toCharArray()) {
                if (v.indexOf(ch) >= 0) {
                    judge = true;
                    count1++;
                    count2 = 0;
                } else {
                    count2++;
                    count1 = 0;
                }

                if (count1 >= 3 || count2 >= 3) {
                    valid = false;
                    break;
                }

                if (ch == prev && ch != 'e' && ch != 'o') {
                    valid = false;
                    break;
                }

                prev = ch;
            }

            if (valid && judge) {
                System.out.println("<" + pwd + "> is acceptable.");
            } else {
                System.out.println("<" + pwd + "> is not acceptable.");
            }
        }

        sc.close();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return Integer.compare(a.length(), b.length());
                }

                int sumA = 0, sumB = 0;
                for (char c : a.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sumA += c - '0';
                    }
                }
                for (char c : b.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sumB += c - '0';
                    }
                }

                if (sumA != sumB) {
                    return Integer.compare(sumA, sumB);
                }

                return a.compareTo(b);
            }
        });

        for (String str : arr) {
            System.out.println(str);
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();

        long[] house = new long[N];

        for (int i = 0; i < N; i++) {
            house[i] = sc.nextLong();
        }

        Arrays.sort(house);

        long max1 = house[N - 1] - house[0];
        long min1 = 1;
        long ans = 0;

        while (max1 >= min1) {
            long mid = (max1 + min1) / 2;
            long num = 1;
            long pre = house[0];

            for (int i = 1; i < N; i++) {
                if (house[i] - pre >= mid) {
                    num++;
                    pre = house[i];
                }
            }

            if (num >= C) {
                min1 = mid + 1;
                ans = Math.max(ans, mid);
            } else {
                max1 = mid - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}

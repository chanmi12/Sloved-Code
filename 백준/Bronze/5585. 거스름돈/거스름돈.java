import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int result = 0;
        int[] money = {500, 100, 50, 10, 5, 1};

        price = 1000 - price;

        for(int i = 0; i < money.length; i++) {
            result += price / money[i];
            price %= money[i];
        }

        System.out.println(result);
    }
}

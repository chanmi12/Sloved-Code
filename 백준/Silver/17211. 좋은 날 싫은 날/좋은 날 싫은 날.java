import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sc = scanner.nextInt();
        int currentMood = scanner.nextInt(); 

        double goodToGood = scanner.nextDouble();
        double goodToBad = scanner.nextDouble();
        double badToGood = scanner.nextDouble();
        double badToBad = scanner.nextDouble();

        double goodProb = (currentMood == 0) ? 1.0 : 0.0;
        double badProb = (currentMood == 1) ? 1.0 : 0.0;

        for (int i = 0; i < sc; i++) {
            double nextGoodProb = goodProb * goodToGood + badProb * badToGood;
            double nextBadProb = goodProb * goodToBad + badProb * badToBad;

            goodProb = nextGoodProb;
            badProb = nextBadProb;
        }

        int goodResult = (int) Math.round(goodProb * 1000);
        int badResult = (int) Math.round(badProb * 1000);

        System.out.println(goodResult);
        System.out.println(badResult);

        scanner.close();
    }
}

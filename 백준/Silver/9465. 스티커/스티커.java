import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int numTestCases;
    private static int numStickers;

    private static int[][] score;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        numTestCases = Integer.parseInt(br.readLine());

        for(int i = 0; i < numTestCases; i ++) {
            numStickers = Integer.parseInt(br.readLine());
            score = new int[2][numStickers];

            for(int j = 0; j < 2; j ++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0; k < numStickers; k ++) {
                    score[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for(int j = 1; j < numStickers; j ++) {
                score[0][j] += j == 1 ? score[1][j - 1] : Math.max(score[1][j - 2], score[1][j - 1]);
                score[1][j] += j == 1 ? score[0][j - 1] : Math.max(score[0][j - 2], score[0][j - 1]);
            }
            System.out.println(Math.max(score[0][numStickers - 1], score[1][numStickers - 1]));
        }

    }
}

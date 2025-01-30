import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int countOfTwos = 0, countOfFives = 0;
        for(long i = 2; i <= n; i*=2) countOfTwos += n / i;
        for(long i = 2; i <= m; i*=2) countOfTwos -= m / i;
        for(long i = 2; i <= n-m; i*=2) countOfTwos -= (n-m) / i;

        for(long i = 5; i <= n; i*=5) countOfFives += n / i;
        for(long i = 5; i <= m; i*=5) countOfFives -= m / i;
        for(long i = 5; i <= n-m; i*=5) countOfFives -= (n-m) / i;

        int result = Math.min(countOfTwos, countOfFives);
        System.out.println(result);
    }
}

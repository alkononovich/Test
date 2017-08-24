import java.util.Arrays;
import java.io.*;

public class Primes {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (primes[i])
                System.out.print(i + " ");
        }
    }
}

import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (N < K) {
            System.out.println(1);
            return;
        }
        final int ONE_MILLION = 1000000000;
        int[] A = new int[N + 1];

        long sum = 0;

        for (int i = 0; i < K; i++) {
            A[i] = 1;
            sum += A[i];
        }

        for (int i = K; i <= N; i++) {
            A[i] = (int)(sum % ONE_MILLION);

            sum += A[i];
            sum -= A[i - K];
        }

        System.out.println(A[N]);
    }
}
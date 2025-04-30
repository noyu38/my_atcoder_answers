import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M + 1]; // 石が入っているマス
        int[] A = new int[N + 1]; // 入っている石の数
        int sum = 0; // 石の合計
        int count = 0;

        for (int i = 1; i <= M; i++) {
            X[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            A[i] = 0;
        }

        for (int i = 1; i <= M; i++) {
            A[X[i]] = sc.nextInt();
            sum += A[X[i]];
        }

        if (sum > N) {
            System.out.println("-1");
        } else {
            for (int i = 1; i <= N - 1; i++) {
                if (A[i] > 1) {
                    int DecreaseAndIncrease = A[i] - 1;
                    A[i] = A[i] - DecreaseAndIncrease;
                    A[i + 1] = A[i + 1] + DecreaseAndIncrease;
                    count += DecreaseAndIncrease;

                }
            }
        }
        if (A[N] > 1) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }
}
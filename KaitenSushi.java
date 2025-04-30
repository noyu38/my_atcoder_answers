import java.util.Scanner;
public class KaitenSushi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        int count;

        for (int i = 0; i < M; i++) {
            count = 0;
            for (int j = 0; j < N; j++) {
                if (B[i] >= A[j]) {
                    count = j + 1;
                    System.out.println(count);
                    break;
                } else if (j == N -1) {
                    count = -1;
                    System.out.println(count);
                }
            }
        }
    }
}
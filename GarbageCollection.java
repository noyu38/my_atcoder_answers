import java.util.Scanner;

public class GarbageCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] q = new int[N];
        int[] r = new int[N];

        for (int i = 0; i < N; i++) {
            q[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] t = new int[Q];
        int[] d = new int[Q];

        for (int i = 0; i < Q; i++) {
            t[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
    }
}
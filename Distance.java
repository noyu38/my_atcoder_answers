import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int count = 0;
        long distance;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            distance = (long)x[i] * x[i] + (long)y[i] * y[i];
            if (distance <= (long)D * D)
            count++;
        }
        System.out.println(count);
    }
}
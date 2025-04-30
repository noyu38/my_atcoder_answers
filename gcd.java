import java.util.Scanner;

public class gcd {
    public static int gcd(int x, int y) {
        while (y != 0) {
            int n = y;
            y = x % y;
            x = n;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long sum = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    sum += gcd(gcd(a, b), c);
                }
            }
        }
        System.out.println(sum);
    }
}
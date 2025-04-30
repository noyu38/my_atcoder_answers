import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] count = new int[N + 1];
        int n = 0;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            n++;
            int m = n % 10000;
            int l = m % 1000;
            int k = l % 100;
            int s = k % 10;
            if (n / 10000 + m / 1000 + l / 100 + k / 10 + s >= A && n / 10000 + m / 1000 + l / 100 + k / 10 + s <= B) {
                count[i] = n;
            }
        }

        for (int i = 1; i <= N; i++) {
            sum += count[i];
        }
        System.out.println(sum);
    }
}
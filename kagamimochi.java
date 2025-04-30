import java.util.Scanner;

public class kagamimochi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        int count = N;

        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (d[i] == d[j]) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class NChoiceQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] C = new int[N];

        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }

        int sum = A + B;

        for (int i = 0; i < N; i++) {
            if (C[i] == sum) {
                System.out.println(++i);
            }
        }
    }
}
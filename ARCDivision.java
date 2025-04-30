import java.util.Scanner;

public class ARCDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] D = new int[N];
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }

        if (R < 1200 || R > 2799) {
            System.out.println(R);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (D[i] == 1 && R >= 1600 && R <= 2799) {
                R += A[i];
            } else if (D[i] == 2 && R >= 1200 && R <= 2399) {
                R += A[i];
            }
        }
        System.out.println(R);
    }
}
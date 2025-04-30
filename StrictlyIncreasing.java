import java.util.Scanner;

class StrictlyIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        boolean answer = true;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (i >= 1) {
                if (!(A[i] > A[i - 1])) {
                    answer = false;
                }
            }
        }
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
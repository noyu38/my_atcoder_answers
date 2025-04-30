import java.util.Scanner;

public class SeekGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[] S = new String[N];
        String[] T = new String[M];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        for (int i = 0; i < M; i++) {
            T[i] = sc.next();
        }

        for (int a = 0; a <= N - M; a++) {
            for (int b = 0; b <= N - M; b++) {
                boolean ok = true;

                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < M; j++) {
                        if (S[a + i].charAt(b + j) != T[i].charAt(j)) {
                            ok = false;
                        }
                    }
                }
                if (ok) {
                    System.out.println((a + 1) + " " + (b + 1));
                }
            }
        }
    }
}
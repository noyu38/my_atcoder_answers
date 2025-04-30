import java.util.Scanner;
import java.util.Arrays;

class MakeTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] table = new String[N][N];
        for (int i = 0; i < N; i++) {
            int j = N - i - 1;
            if ((i <= j) && (i % 2 == 1) ) {
                for (int k = i; k <= j; k++) {
                    for (int l = i; l <= j; l++) {
                        table[k][l] = ".";
                    }
                }
            } else if ((i <= j) && (i % 2 == 0)) {
                for (int k = i; k <= j; k++) {
                    for (int l = i; l <= j; l++) {
                        table[k][l] = "#";
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
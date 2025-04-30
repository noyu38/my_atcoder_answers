import java.util.Scanner;

public class CandyButton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] T = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        int countCandy = 1;
        int gotTime = T[0];

        for (int i = 1; i < N; i++) {
            if (T[i] - gotTime >= C) {
                countCandy += 1;
                gotTime = T[i];
            } 
        }
        System.out.println(countCandy);
    }
}
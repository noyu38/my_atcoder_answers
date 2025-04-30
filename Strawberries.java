import java.util.Scanner;

public class Strawberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int count = 0;
        StringBuilder sb = new StringBuilder(S);

        for (int i = 0; i <= N - K; i++) {
            boolean canEat = true;
            for (int j = 0; j < K; j++) {
                if (sb.charAt(i + j) != 'O') {
                    canEat = false;
                    break;
                }
            }
            if (canEat) {
                count++;

                for (int j = 0; j < K; j++) {
                    sb.setCharAt(i + j, 'X');
                }
            }
        }

        System.out.println(count);
    }
}
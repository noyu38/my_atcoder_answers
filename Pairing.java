import java.util.Scanner;

public class Pairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = sc.nextInt();
        }

        boolean[] used = new boolean[4];

        for (int i = 0; i < 4; i++) {
            if (used[i]) 
                continue;
            for (int j = i + 1; j < 4; j++) {
                if (!used[i] && A[i] == A[j]) {
                    count++;
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
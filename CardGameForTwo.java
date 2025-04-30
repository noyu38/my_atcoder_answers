import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGameForTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] a = new Integer[N];
        int PointOfAlice = 0;
        int PointOfBob = 0;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                PointOfAlice += a[i];
            } else {
                PointOfBob += a[i];
            }
        }

        System.out.println(PointOfAlice - PointOfBob);
    }
}
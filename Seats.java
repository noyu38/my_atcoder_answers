import java.util.Scanner;

public class Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] seats = new char[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            seats[i] = S.charAt(i);
        }

        for (int i = 0; i < N - 2; i++) {
            if (seats[i] == '#' && seats[i + 2] == '#' && seats[i + 1] == '.') {
                count++;
            }
        }
        System.out.println(count);
    }
}
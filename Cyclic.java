import java.util.Scanner;

public class Cyclic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N / 100;
        int b = (N % 100) / 10;
        int c = N % 10;

        System.out.println((100 * b + 10 * c + a) + " " + (100 * c + 10 * a + b));

    }
}
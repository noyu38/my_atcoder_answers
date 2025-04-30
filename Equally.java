import java.util.Scanner;

public class Equally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sumAB = a + b;
        int sumBC = b + c;
        int sumCA = c + a;

        if ((a == b && b == c) || sumAB == c || sumBC == a || sumCA == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
import java.util.Scanner;

public class Power1 {
    static double power(double x, int n) {
        double tmp = 1.0;

        while (n-- > 0)
        tmp *= x;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("aのb乗を求めます。");
        System.out.print("実数a : ");
        double a = sc.nextDouble();
        System.out.print("整数b : ");
        int b = sc.nextInt();

        System.out.println(a + "の" + b + "乗は" + power(a,b) + "です。");
    }
}
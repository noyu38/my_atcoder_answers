import java.util.Scanner;

class Marbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = 0;
        if (s - 100 >= 0) {
            n++;
            if (s - 10 >= 100) {
                n++;
                if (s - 1 >= 110) {
                    n++;
                }
            } else {
                if (s - 1 >= 100)
                    n++;
            }
        } else {
            if (s - 10 >= 0) {
                n++;
                if (s - 1 >= 10) {
                    n++;
                }
            } else {
                if (s - 1 >= 0) {
                    n++;
                }
            }
        }

        System.out.println(n);

    }
}
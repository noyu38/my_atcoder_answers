import java.util.Scanner;
class DoorInTheCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] ch = new char[N + 1];
        for (int i = 1; i <= N; i++) {
            ch[i] = '-';
        }
        if (N % 2 == 0) {
            ch[N / 2] = '=';
            ch[N / 2 + 1] = '=';
        } else {
            ch[N / 2 + 1] = '=';
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
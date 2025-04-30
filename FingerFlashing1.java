import java.util.Scanner;

class FingerFlashing1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hand = sc.nextInt();

        switch (hand) {
            case 0:
                System.out.println("グー");
                break;
            case 1:
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println("パー");
                break;
        }
    }
}
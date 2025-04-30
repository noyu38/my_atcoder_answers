import java.util.Scanner;

public class StringA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        sc.nextLine();
        String T = sc.nextLine();
        StringBuilder sb = new StringBuilder(T);
        char[] ch = new char[length];

        for (int i = 0; i < length; i++) {
            ch[i] = sb.charAt(i);
        }

        boolean unko = true;

        for (int i = 0; i < ((length + 1) / 2) - 1; i++) {
            if (ch[i] != '1') {
                unko = false;
                break;
            }
        }

        if (ch[((length + 1) / 2) - 1] != '/') {
            unko = false;
        }

        for (int i = ((length + 1) / 2); i < length; i++) {
            if (ch[i] != '2') {
                unko = false;
            }
        } 

        if (length % 2 == 0) {
            System.out.println("No");
        } else if (unko) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
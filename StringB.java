import java.util.Scanner;

public class StringB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        StringBuilder sb = new StringBuilder(S);
        int length = sb.length();
        char[] ch = new char[length];
        if (length % 2 != 0) {
            System.out.println("No");
            System.exit(0);
        }

        for (int i = 0; i < length; i++) {
            ch[i] = sb.charAt(i);
        }
        boolean unko = true; //1122文字列かどうか
        boolean chinchin = false; //各文字がちょうど2回ずつ現れるか
        for (int i = 0; i < (length / 2); i++) {
            if (ch[i] != ch[i + 1]) {
                unko = false;
            }
        }
    }
}
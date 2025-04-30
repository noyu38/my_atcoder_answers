import java.util.Scanner;

public class DailyCookie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        System.out.println();
        String S = sc.next();
        StringBuilder sb = new StringBuilder(S);
        int length = sb.length();
        char[] ch = new char[length];
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            ch[i] = sb.charAt(i);
            if (ch[i] == '@') {
                sb.setCharAt(i, '.');
                count++;
            }
            if (count == D)
                break;
        }

        System.out.println(sb);
    }
}
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int cur = 0;

        while (cur < n - 1) {
            if (sb.charAt(cur) == 'W' && sb.charAt(cur + 1) == 'A') {
                sb.setCharAt(cur, 'A');
                sb.setCharAt(cur + 1, 'C');
                if (cur > 0) cur--;
            } else {
                cur++;
            }
        }

        System.out.println(sb.toString());
    }
}

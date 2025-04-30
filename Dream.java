import java.util.Scanner;

public class Dream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        String[] patterns = {"dream", "dreamer", "erase", "eraser"};

        while (!S.isEmpty()) {
            boolean matched = false;
            for (String pattern : patterns) {
                if (S.endsWith(pattern)) {
                    S = S.substring(0, S.length() - pattern.length());
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Rearranging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        char[] ch = S.toCharArray();

        Arrays.sort(ch);

        String sortedString = new String(ch);
        if (sortedString.equals("ABC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
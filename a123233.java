import java.util.Scanner;

public class a123233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        StringBuilder strN = new StringBuilder(N);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < 6; i++) {
            char ch = strN.charAt(i);
            if (ch == '1') {
                count1++;
            } else if (ch == '2') {
                count2++;
            } else if (ch == '3') {
                count3++;
            }
        }
        if (count1 == 1 && count2 == 2 && count3 == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
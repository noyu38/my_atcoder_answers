import java.util.Scanner;

class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != T.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
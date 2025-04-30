import java.util.Scanner;

class PoisonousOyster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[2];
        for (int i = 0; i < S.length; i++) {
            S[i] = sc.next();
        }
        if (S[0].equals("sick") && S[1].equals("sick")) {
            System.out.println(1);
        } else if (S[0].equals("sick") && S[1].equals("fine")) {
            System.out.println(2);
        } else if (S[0].equals("fine") && S[1].equals("sick")) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
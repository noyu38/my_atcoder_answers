import java.util.Scanner;

class A_B_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] fragments = new char[S.length()];
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            fragments[i] = S.charAt(i);
        }
        for (int i = 0; i < S.length(); i++) {
            if (fragments[i] == 'A') {
                for (int j = i + 1; j < S.length(); j++) {
                    if (fragments[j] == 'B') {
                        int distance = j - i;
                        if (j + distance < S.length()) {
                            if (fragments[j + distance] == 'C')
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
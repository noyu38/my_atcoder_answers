import java.util.Scanner;
public class aaaadaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        String S = sc.next();
        char[] ch = new char[N];
        StringBuilder sb = new StringBuilder(S);
        
        for(int i = 0; i < N; i++) {
            ch[i] = sb.charAt(i);
            if(ch[i] != c1) {
                sb.setCharAt(i, c2);
            }
        }

        System.out.println(sb);
    }
}
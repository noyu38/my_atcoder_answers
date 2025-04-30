import java.util.Scanner;

public class HurdleParsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder(S);
        int count = 0; // '|'の数
        int length = sb.length(); // 文字列の長さ
        char[] ch = new char[length];

        for (int i = 0; i < length; i++) {
            ch[i] = sb.charAt(i); 
            if (i > 0 && ch[i] == '|') {
                count++;
            }
        }

        int[] answer = new int[count];
        int j = 1;
        for (int i = 0; i < count; i++) {
            int tmp = 0;
            while (ch[j] == '-') {
                tmp++;
                j++;
            }
            answer[i] = tmp;
            j++;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.print("\n");
    }
}
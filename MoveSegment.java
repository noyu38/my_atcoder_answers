import java.util.Scanner;

public class MoveSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder(S);
        int length = sb.length();
        char[] ch = new char[length];
        int LineCount1 = 0;
        int j;

        for (int i = 0; i < length; i++) {
            ch[i] = sb.charAt(i);
            if (i == 0 && ch[i] == '1') {
                LineCount1++;
            }
            if (i != 0 && ch[i] == '1' && ch[i - 1] == 0) {
                LineCount1++;
            }
        }

        String[] subStingOfS = new String[LineCount1];
        boolean[] used = new boolean[length];
        int length2;
        int replaceStart = 0;

        for (int i = 0; i < length; i++) {
            used[i] = false;
        }

        for (int i = 0; i < length; i++) {
            if (used[i] == true) {
                continue;
            }
            if (ch[i] == 1) {
                j = i + 1;
                while (ch[j] == '1') {
                    used[j] = true;
                    j++;
                }
                for (int n = 0; n < LineCount1; n++) {
                    if (subStingOfS[n] == null) {
                        subStingOfS[n] = sb.substring(i, j - 1);
                        if (n == K -2) {
                            replaceStart = j;
                        } 
                        if (n == K - 1) {
                            length2 = subStingOfS[n].length();
                            sb.replace(replaceStart, replaceStart + length2 - 1, subStingOfS[K - 1]);
                        }
                    }
                    break;
                }
            }


        }
        sb.toString();
        System.out.println(sb);
    }
}
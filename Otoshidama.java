import java.util.Scanner;

public class Otoshidama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        
        int x = -1, y = -1, z = -1;
        
        // 10000円札の枚数をループ
        for (int i = 0; i <= N; i++) {
            // 5000円札の枚数をループ
            for (int j = 0; j <= N - i; j++) {
                int k = N - i - j;  // 残りを1000円札に割り当てる
                // 金額のチェック
                if (10000 * i + 5000 * j + 1000 * k == Y) {
                    x = i;
                    y = j;
                    z = k;
                    break;
                }
            }
            if (x != -1) break;
        }
        
        System.out.println(x + " " + y + " " + z);
    }
}
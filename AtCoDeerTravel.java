import java.util.Scanner;

public class AtCoDeerTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] plans = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            plans[i][0] = scanner.nextInt(); // t_i
            plans[i][1] = scanner.nextInt(); // x_i
            plans[i][2] = scanner.nextInt(); // y_i
        }
        
        // 初期位置と時刻
        int currentT = 0, currentX = 0, currentY = 0;

        // 各プランを確認
        for (int i = 0; i < N; i++) {
            int t = plans[i][0];
            int x = plans[i][1];
            int y = plans[i][2];

            // 移動にかかるマンハッタン距離
            int distance = Math.abs(x - currentX) + Math.abs(y - currentY);
            // 時間差
            int timeDiff = t - currentT;

            // 条件チェック
            if (distance > timeDiff || (distance % 2 != timeDiff % 2)) {
                System.out.println("No");
                scanner.close();
                return;
            }

            // 状態の更新
            currentT = t;
            currentX = x;
            currentY = y;
        }

        // すべてのプランが実行可能なら "Yes"
        System.out.println("Yes");
        scanner.close();
    }
}
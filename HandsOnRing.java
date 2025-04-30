import java.util.Scanner;

public class HandsOnRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // パーツの数
        int Q = sc.nextInt(); // 指示の数
        sc.nextLine();

        char[] H = new char[Q]; // 操作する手 (L/R)
        int[] T = new int[Q]; // 移動先のパーツ番号

        for (int i = 0; i < Q; i++) {
            H[i] = sc.next().charAt(0);
            T[i] = sc.nextInt();
        }

        // 初期状態: 左手が1、右手が2
        int leftHand = 1;
        int rightHand = 2;
        int totalMoves = 0;

        for (int i = 0; i < Q; i++) {
            if (H[i] == 'L') {
                // 左手をパーツT[i]に移動
                totalMoves += calculateRestrictedMoves(N, leftHand, T[i], rightHand);
                leftHand = T[i];
            } else if (H[i] == 'R') {
                // 右手をパーツT[i]に移動
                totalMoves += calculateRestrictedMoves(N, rightHand, T[i], leftHand);
                rightHand = T[i];
            }
        }

        System.out.println(totalMoves);
    }

    // 手の移動回数を計算する関数（制約を考慮）
    static int calculateRestrictedMoves(int N, int current, int target, int otherHand) {
        int clockwise = (target - current + N) % N; // 時計回り
        int counterClockwise = (current - target + N) % N; // 反時計回り

        // 時計回り・反時計回りの移動で他方の手を超えないか確認
        if (willCrossHand(N, current, target, otherHand, true)) {
            clockwise = Integer.MAX_VALUE; // 超える場合は無効
        }
        if (willCrossHand(N, current, target, otherHand, false)) {
            counterClockwise = Integer.MAX_VALUE; // 超える場合は無効
        }

        return Math.min(clockwise, counterClockwise);
    }

    // 他方の手を超えるかどうかを判定
    static boolean willCrossHand(int N, int current, int target, int otherHand, boolean clockwise) {
        if (clockwise) {
            while (current != target) {
                current = (current % N) + 1; // 時計回りに進む
                if (current == otherHand) return true;
            }
        } else {
            while (current != target) {
                current = (current - 2 + N) % N + 1; // 反時計回りに進む
                if (current == otherHand) return true;
            }
        }
        return false;
    }
}

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;
// import java.util.List;
// 
// class RankingWithTies {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         List<Integer> sortedScore = new ArrayList<>();
//         int[] score = new int[N];
//         int[] rank = new int[N];
//         int r = 1;
//         int people = 0;
// 
//         for (int i = 0; i < N; i++) {
//             int tmp = sc.nextInt();
//             score[i] = tmp;
//             sortedScore.add(tmp);
//         }
//         Collections.sort(sortedScore, Collections.reverseOrder());
// 
//         while (r != N + 1) {
//             for (int i = 0; i < N; i++) {
//                 if (score[i] == sortedScore.get(0)) {
//                     rank[i] = r;
//                     sortedScore.remove(0);
//                     people++;
//                 }
//             }
//             r += people;
//         }
//         // System.out.println(score);
// 
//         for (int i = 0; i < N; i++) {
//             System.out.println(rank[i]);
//         }
// 
//     }
// }
import java.util.*;

class RankingWithTies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> sortedScore = new ArrayList<>();
        int[] score = new int[N];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            sortedScore.add(score[i]);
        }

        Collections.sort(sortedScore, Collections.reverseOrder());

        int r = 1;
        while (!sortedScore.isEmpty()) {
            int currentScore = sortedScore.get(0);
            int count = 0;

            for (int i = 0; i < N; i++) {
                if (score[i] == currentScore && rank[i] == 0) {
                    rank[i] = r;
                    count++;
                }
            }

            // 該当スコアを全て削除
            for (int i = 0; i < count; i++) {
                sortedScore.remove(0);
            }

            r += count;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(rank[i]);
        }
    }
}

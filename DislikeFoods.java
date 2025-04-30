import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class DislikeFoods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int dislikeFood;
        int count = 0;
        int k;
        boolean[] used = new boolean[M];
        Map<Integer, List<Integer>> foods = new HashMap<>();


        for (int i = 0; i < M; i++) {
            used[i] = false;
            k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                foods.putIfAbsent(i, new ArrayList<Integer>());
                int food = sc.nextInt();
                foods.get(i).add(food);
            }
        }

        for (int i = 0; i < N; i++) {
            dislikeFood = sc.nextInt();
            for (int j = 0; j < M; j++) {
                if (foods.get(j).contains(dislikeFood)) {
                    foods.get(j).remove(foods.get(j).indexOf(dislikeFood));
                }
                if (foods.get(j).isEmpty() && !used[j]) {
                    count++;
                    used[j] = true;
                }
            }
            System.out.println(count);
        }
    }
}
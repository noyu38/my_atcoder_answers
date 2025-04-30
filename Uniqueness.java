import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Uniqueness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> unUsedNumber = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int key = sc.nextInt();
            if (map.containsKey(key) && unUsedNumber.contains(key)) {
                unUsedNumber.remove(key);
                continue;
            } else {
                unUsedNumber.add(key);
            }
            map.put(key, i);
        }
    }
}
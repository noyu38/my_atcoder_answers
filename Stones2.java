import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Stones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        List<Pair> xa = new ArrayList<>();

        for (int i = 0; i < m; ++i) {
            xa.add(new Pair(sc.nextLong(), 0));
        }
        for (int i = 0; i < m; ++i) {
            xa.get(i).second = sc.nextLong();
        }    

        Collections.sort(xa, Comparator.comparingLong(p -> p.first));

        long sum = 0, sumIdx = 0;
        for (int i = 0; i < m; ++i) {
            if (sum < xa.get(i).first - 1) {
                System.out.println(-1);
                return;
            }
            sum += xa.get(i).second;
            sumIdx += xa.get(i).second * xa.get(i).first;
        }

        if (sum != n) {
            System.out.println(-1);
            return;
        }

        System.out.println(n * (n + 1) / 2 - sumIdx);
    }
}

class Pair {
    long first, second;

    Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}
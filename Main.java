import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> line = new ArrayDeque<>();
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            switch (x) {
                case 1 -> {
                    int menu = sc.nextInt();
                    line.addLast(menu);
                }
                case 2 -> {
                    System.out.println(line.getFirst());
                    line.removeFirst();
                }
            }
        }
        sc.close();
    }
}
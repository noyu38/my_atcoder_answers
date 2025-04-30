import java.util.LinkedList;
import java.util.Scanner;

public class query {
    static LinkedList<Integer> snakeLengths = new LinkedList<>();
    static int headOffset = 0;
    static int totalLength = 0;
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                int l = sc.nextInt();
                addSnake(l);
            } else if (queryType == 2) {
                removeSnake();
            } else if (queryType == 3) {
                int k = sc.nextInt();
                System.out.println(getSnakeHead(k));
            }
        }

    }

    static void addSnake(int length) {
        snakeLengths.add(length);
        totalLength += length;    
    }
    
    static void removeSnake() {
        int removedLength = snakeLengths.removeFirst();
        headOffset += removedLength;
        totalLength -= removedLength;
    }

    static int getSnakeHead(int k) {
        int position = headOffset;
        for (int i = 0; i < k - 1; i++) {
            position += snakeLengths.get(i);
        }
        return position;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class FullHouse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[7];
        List<Integer> usedNumber = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            A[i] = sc.nextInt();
        }
        boolean count3cards = false;
        boolean count2cards = false;
        for (int i = 0; i < 6; i++) {
            int count = 1;
            if (usedNumber.contains(A[i]))
                continue;
            for (int j = i + 1; j < 7; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 2) {
                count2cards = true;
            } else if (count >= 3) {
                if (count3cards) {
                    count2cards = true;
                } else {
                    count3cards = true;
                }
            }
            usedNumber.add(A[i]);
        }
        if (count2cards && count3cards) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
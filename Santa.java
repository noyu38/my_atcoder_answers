import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Santa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt() - 1;
        int Y = sc.nextInt() - 1;
        sc.nextLine();
        String[][] S = new String[H][W];

        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < W; j++) {
                S[i][j] = String.valueOf(line.charAt(j));
            }
        }
        String T = sc.next();
        int length = T.length();
        char[] ch = new char[length];
        for (int i = 0; i < length; i++) {
            ch[i] = T.charAt(i);
        }

        Set<String> HousePlaces = new HashSet<>();
        if (S[X][Y].equals("@")) {
            HousePlaces.add(X + "," + Y);
        }

        for (int i = 0; i < length; i++) {
            if (X > 0 && ch[i] == 'U' && (S[X - 1][Y].equals(".") || S[X - 1][Y].equals("@"))) {
                X = X - 1;
            } else if (X < H - 1 && ch[i] == 'D' && (S[X + 1][Y].equals(".") || S[X + 1][Y].equals("@"))) {
                X = X + 1;
            } else if (Y > 0 && ch[i] == 'L' && (S[X][Y - 1].equals(".") || S[X][Y - 1].equals("@"))) {
                Y = Y - 1;
            } else if (Y < W - 1 && ch[i] == 'R' && (S[X][Y + 1].equals(".") || S[X][Y + 1].equals("@"))) {
                Y = Y + 1;
            }
            if (S[X][Y].equals("@")) {
                HousePlaces.add(X + "," + Y);
            }
        }
        System.out.println((X + 1) + " " + (Y + 1) + " " + HousePlaces.size());
        
    }
}
import java.util.Scanner;

public class Painting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int n = 1;

        if (H >= W) {
            int t = H;
            while (H < N) {
                H += t;
                n++;
            }System.out.println(n);
        } else {
            int s = W;
            while (W < N) {
                W += s;
                n++;
            }System.out.println(n);
        }
        
    }
}
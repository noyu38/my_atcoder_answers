import java.util.Scanner;

public class IlluminateBuildings {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int maxBuildings = findMaxBuildings(N, H);
        System.out.println(maxBuildings);
	}
    public static int findMaxBuildings(int N, int[] H) {
        int maxCount = 1;

        for (int d = 1; d < N; d++) {
            for (int start = 0; start < N; start++) {
                int count = 0;
                int currentHeight = H[start];
                boolean valid = true;

                for (int i = start; i < N; i += d) {
                    if (H[i] == currentHeight) {
                        count++;
                    } else {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    maxCount = Math.max(maxCount, count);
                }
            }
        }
        return maxCount;
    }
}
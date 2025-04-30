import java.util.Scanner;

class season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int retry;
        do {
            int month = sc.nextInt();

            if (month >= 3 && month <= 5)
                System.out.println("それは春です");
            else if (month >= 6 && month <= 8)
                System.out.println("それは夏です");
            else if (month >= 9 && month <= 11)
                System.out.println("それは秋です");
            else if (month >= 12 && month <= 2)
                System.out.println("それは冬です");
            else
                System.out.println("1から12の範囲で入力してください");

            System.out.print("もう一度？　1･･･Yes/0･･･No");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
import java.util.Scanner;

class birthday_and_age {
    public static void main(String arts[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("<HTML>\n");
        System.out.print("<HEAD><TITLE>Birthday and Age</TITLE></HEAD>\n");
        System.out.print("<BODY>\n");
        System.out.print("What year is it when you are 20?<BR>\n");
        System.out.print("- When is your birth year?:  ");
        int year = sc.nextInt();
        System.out.println(year);
        System.out.println("<BR>\n");
        System.out.println("- Year when you are 20:  ");
        System.out.println(year + 20);
    }
}

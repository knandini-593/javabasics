import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  y = sc.nextInt();

        if (n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
            System.out.println("Leap Year");
        else System.out.println("Not Leap Year");
    }
}


package Practice;

import java.util.Scanner;

public class QuetientAndRemainderCompute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend number :-");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor number :-");
        int divisor = sc.nextInt();
        int quetient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Qutient : - " +quetient);
        System.out.println("Remainder : - " +remainder);
    }
}

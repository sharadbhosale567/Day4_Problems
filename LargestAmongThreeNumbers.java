package Practice;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter three numbers :- ");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();

        if ( num1 > num2  &&  num1 > num3  ) {
            System.out.println("num1 is greatest number");
        }
        else   if ( num2 > num1  &&  num2 > num3  ) {
            System.out.println("num2 is greatest number");
        }
        else {
            System.out.println("num3 is greatest number");
        }
    }
}

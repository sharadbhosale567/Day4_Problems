package Practice;

import java.util.Scanner;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int Number;
        System.out.println("Enter Number : ");
        Scanner number = new Scanner(System.in);
        Number = number.nextInt();
        int NUMBER = Number%2;
        if ( NUMBER == 0 ) {
            System.out.println("Number is even number");
        }
        else {
            System.out.println("Number is odd number");
        }
    }
}

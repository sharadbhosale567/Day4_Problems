package Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year : ");
        Scanner year = new Scanner(System.in);
        int YEAR = year.nextInt();
        int condition1 = ( (YEAR)  % 100 ) ;
        int condition2 = ( (YEAR)  % 4) ;
        if ( condition1 == 0 && condition2 == 0) {
            System.out.println("YEAR IS LEAP YEAR");
        }
        else {
            System.out.println("YEAR IS NOT LEAP YEAR");
        }
    }
}

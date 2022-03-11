package Practice;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : - ");
        int N = sc.nextInt();
        int powerOfTwo = 1;
        for (int i=1; i<=N; i++) {

            powerOfTwo = 2 * powerOfTwo;
            System.out.println(powerOfTwo);
        }
    }
}

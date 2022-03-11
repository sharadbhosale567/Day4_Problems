package Practice;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int M,N,t;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Two Numbers : - ");
        M = num.nextInt();
        N = num.nextInt();
        System.out.println("Before swaping numbers " + M + " " +N);

        t = M;
        M = N;
        N = t;
        System.out.println("After swaping number "  + M + " " +N);
    }
}

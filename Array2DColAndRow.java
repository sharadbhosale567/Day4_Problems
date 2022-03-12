package Practice;

import java.util.Scanner;

public class Array2DColAndRow {
    public static void main(String[] args) {
        int M,N;
        Scanner sc = new Scanner(System.in);
        int row = M = sc.nextInt();
        int col = N = sc.nextInt();

        int [][] number = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print( number[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

 import java.util.Scanner;
 class matrixaddition {
    public static void main(String[] args) {

        int r1, c1,r2,c2, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix A:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter size of matrix B:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();


        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int sum[][] = new int[r1][c1];

        System.out.println("Enter elements of Matrix A:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if((r1==r2)&&(c1==c2));{
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        }

        System.out.println("Sum of the matrices:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}






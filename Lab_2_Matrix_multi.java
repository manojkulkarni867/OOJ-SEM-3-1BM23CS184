import java.util.Scanner;

class MatrixMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int result[][] = new int[3][3];
        int i, j, k;

        System.out.println("Enter elements for the first 3x3 matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("Enter term [%d][%d]: ", i, j);
                m1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for the second 3x3 matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("Enter term [%d][%d]: ", i, j);
                m2[i][j] = scanner.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (k = 0; k < 3; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


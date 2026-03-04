import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User defines matrix size
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Create matrix
        float[][] matrix = new float[rows][columns];

        // Fill matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter value for position [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextFloat();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("[%.2f] ", matrix[i][j]);
            }
            System.out.println();
        }

        // Display main diagonal if square matrix
        if (rows == columns) {
            System.out.println("\nMain diagonal:");
            for (int i = 0; i < rows; i++) {
                System.out.printf("[%.2f] ", matrix[i][i]);
            }
        }

        sc.close();
    }
}

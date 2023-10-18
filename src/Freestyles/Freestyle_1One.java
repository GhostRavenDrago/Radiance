package Freestyles;

import java.util.Random;

public class Freestyle_1One {

    public static void main(String[] args) {
        System.out.printf("Hello Universe%n");
        String name = "James Baldwin";
        Random rand = new Random();
        int N = rand.nextInt(20);
        for (char i : name.toCharArray()) {
            System.out.printf("%nThis is the letter %c-> %d%n", i, N);
        }
        jupiter(N);
        String Dunking = new String(Manipulation());
        System.out.println(Dunking.toUpperCase());
        matrixHero();
        matrixTraversal();
    }

    static int[] jupiter(int N) {
        int[] fib = new int[N];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i] + "\n");
        }
        return fib;
    }

    static void matrixHero() {
        int[][] con = new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 5, 6 } };

        for (int i = 0; i < con.length; i++) {
            for (int j = 0; j < con[i].length; j++)
                System.out.println("\n" + con[i][j] + "\n");
        }
    }

    static String Manipulation() {
        String saint = new String("Jungle is King");
        saint = "New SantiKode";
        return saint;
    }

    static void matrixTraversal() {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Determine the number of rows and columns in the matrix
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Initialize a single loop to iterate through the flattened matrix
        for (int i = 0; i < numRows * numCols; i++) {
            // Calculate the row and column indices from the flattened index
            int row = i / numCols;
            int col = i % numCols;

            // Access the element in the original matrix
            int element = matrix[row][col];

            // Perform operations with the element
            System.out.println("Element at row " + row + ", column " + col + " is " + element);
        }

    }

}

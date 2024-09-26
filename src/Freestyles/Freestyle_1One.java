package Freestyles;

public class Freestyle_1One {
    public static void main(String[] args) {
        System.out.println("\n Hello Universe");
        String name = "James Baldwin";

        for(char i : name.toCharArray() ){
            System.out.printf("%nThis is the letter %c%n", i);
        }

        // Define a multidimensional array
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Iterate through each element of the multidimensional array using a single loop
        for (int i = 0; i < multiArray.length * multiArray[0].length; i++) {
            int row = i / multiArray[0].length;  // Calculate row index
            int col = i % multiArray[0].length;  // Calculate column index
            int element = multiArray[row][col];  // Get the element at the current indices
            System.out.printf("The elements are -> %d%n",element);
        }
    }
}


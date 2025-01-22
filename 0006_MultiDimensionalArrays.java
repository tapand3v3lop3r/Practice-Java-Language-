public class MultiDimensionalArrays {
    public static void main(String[] args){

        // Multi Dimensional Arrays:

        int[][] matrix = new int[3][3];                              // Just the declaration with size
        int[][] matrix1 = {                                          // Declaration with initialisation
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        matrix[0][0] = 1;                                            // Assigning values to the array[matrix]
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        System.out.println("[matrix] using simple for loop:");
        for (int i = 0; i < matrix.length; i++){                     // Reading elements from array[matrix1]
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("[matrix1] using simple for loop:");
        for (int i = 0; i < matrix1.length; i++){                    // Reading elements from array[matrix1]
            for (int j = 0; j < matrix1[i].length; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("[matrix] using enhanced for loop:");
        for (int[] intArr : matrix) {                                 // Enhanced for loop for [matrix]
            for (int anInt : intArr) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("[matrix1] using enhanced for loop:");
        for (int[] intArr1 : matrix1) {                                // Enhanced for loop for [matrix1]
            for (int anInt : intArr1) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

public class ArrayLesson {
    public static void main(String[] args){

        //Single Dimension Array
        int[] numbers = new int[5];                         // Declaration of size
        int[] numbers1 = {1, 2, 3, 4, 5};                   // Declaration with Initialisation


        //Multi Dimensional Array
        int[][] matrix = new int[3][3];                     // Declaration
        int[][] matrix1 = {                                 // Declaration with Initialisation
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        //Jagged Arrays ----> Arrays with a defined row size but no column is fixed...
        int[][] JaggedArray = new int[3][];                          // Declaration of row size
        JaggedArray[0] = new int[2];                                 // Declaration of column size for 1st row
        JaggedArray[1] = new int[3];                                 // Declaration of column size for 2nd row
        JaggedArray[2] = new int[1];                                 // Declaration of column size for 3rd row

        JaggedArray[0][0] = 1;                                       // Assigning of values [i][j]
        JaggedArray[0][1] = 2;                                       // [i] --> row
        JaggedArray[1][0] = 3;                                       // [j] --> column
        JaggedArray[1][1] = 4;
        JaggedArray[1][2] = 5;
        JaggedArray[2][0] = 6;

        for (int i = 0; i < JaggedArray.length; i++){                // Reading values from the Jagged Array
            for (int j = 0; j < JaggedArray[i].length; j++){
                System.out.print(JaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}

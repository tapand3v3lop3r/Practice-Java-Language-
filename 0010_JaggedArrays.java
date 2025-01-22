public class JaggedArrays {
    public static void main(String[] args){

        // Jagged Arrays ---> Arrays with fixed row size but different column size

        int[][] JaggedArray = new int[3][];              // Declaration of the array with row size = 3
        JaggedArray[0] = new int[2];                     // 1st column size
        JaggedArray[1] = new int[3];                     // 2nd column size
        JaggedArray[2] = new int[1];                     // 3rd column size

        JaggedArray[0][0] = 1;                                       // Assigning of values [i][j]
        JaggedArray[0][1] = 2;                                       // [i] --> row
        JaggedArray[1][0] = 3;                                       // [j] --> column
        JaggedArray[1][1] = 4;
        JaggedArray[1][2] = 5;
        JaggedArray[2][0] = 6;

        System.out.println("--------------------------------------");
        System.out.println("Jagged Array using simple for loop....");
        for (int i = 0; i < JaggedArray.length; i++){                // Reading values from the Jagged Array
            for (int j = 0; j < JaggedArray[i].length; j++){
                System.out.print(JaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("Jagged Arrays using enhanced for loop....");
        for (int[] ints : JaggedArray) {                             // Enhanced for loop
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

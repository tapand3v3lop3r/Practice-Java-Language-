public class SingleDimensionArrays {
    public static void main(String[] args){

        // Single Dimensional Arrays:

        int[] numbers = new int[3];                                  // Just the declaration with size
        int[] numbers1 = {1, 2, 3, 4, 5};                            // Declaration with initialisation

        numbers[0] = 1;                                              // Assigning values to the array[numbers]
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println("[numbers] using simple for loop:");
        for (int i = 0; i < numbers.length; i++){                    // Reading elements from array[numbers]
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");

        System.out.println("[numbers1] using simple for loop:");
        for (int i = 0; i < numbers1.length; i++){                   // Reading elements from array[numbers1]
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");

        System.out.println("[numbers] using enhanced for loop:");
        for(int num: numbers){                                       // Enhanced for loop for [numbers]
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("------------------");

        System.out.println("[numbers1] using enhanced for loop:");
        for(int num: numbers1){                                      // Enhanced for loop for [numbers1]
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

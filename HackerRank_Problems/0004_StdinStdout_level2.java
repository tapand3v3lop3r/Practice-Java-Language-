import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        sc.nextLine();
        String z = sc.nextLine();
        
        System.out.println("String: " + z);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
        
        sc.close();
    }
}


/*

!!! NOTE !!!

1. sc.nextInt() reads the integer, leaving a newline (\n) in the buffer.
2. sc.nextDouble() reads the double, leaving another newline in the buffer.
3. The first sc.nextLine() (added in the fix) consumes the leftover newline, and the second sc.nextLine() correctly reads the actual string input.


*/

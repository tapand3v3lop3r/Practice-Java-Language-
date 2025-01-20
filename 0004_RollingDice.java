import java.util.Random;

public class RollingDice {
    public static void main(String[] args){
        System.out.println("The Rolling Dice Program...");

        Random DiceNumber = new Random();
        int x = DiceNumber.nextInt(6) + 1;

        System.out.println("You got a " + x + " on the dice.");
    }
}

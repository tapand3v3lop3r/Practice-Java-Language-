class main{
    int x = 5;
    String y = "Number = ";
}

public class MultipleClasses {
    String z = "Understanding multiple objects usage in classes...";

    public static void main(String[] args){

        main object1 = new main();
        MultipleClasses object2 = new MultipleClasses();

        System.out.println("-----------------------------------");
        System.out.println(object2.z);
        System.out.println("-----------------------------------");
        System.out.println(object1.y + object1.x );
    }
}

public class MultipleObjects {
    int x = 5;
    String y = "number = ";

    public static void main(String[] args){
        MultipleObjects obj1 = new MultipleObjects();
        MultipleObjects obj2 = new MultipleObjects();

        System.out.print(obj1.y);
        System.out.print(obj2.x);
    }
}

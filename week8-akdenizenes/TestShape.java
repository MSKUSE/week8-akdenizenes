public class TestShape {
    public static void main(String[] args) {
        /*Shape square = new Shape("blue");
        square.describe(5);
        square.describe(5.0);
        square.describe(5,4);*/

       /* Rectangle square = new Rectangle("blue", 5, 4);
        square.describe();*/

        Rectangle r1 = new Rectangle("blue",3,4);
        Rectangle r2 = new Rectangle("blue",3,4);
        System.out.println(r1.equals(r2));
    }
}

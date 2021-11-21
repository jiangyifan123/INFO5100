package Question5_2;

public class Square implements Shape{
    static String name = "Square";
    @Override
    public void draw() {
        System.out.println("Drawing a " + this.name);
    }
}

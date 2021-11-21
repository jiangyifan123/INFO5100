package Question5_2;

public class Circle implements Shape{
    static String name = "Circle";
    @Override
    public void draw() {
        System.out.println("Drawing a " + this.name);
    }
}

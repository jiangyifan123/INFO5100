package Question5_2;

public class Rectangle implements Shape{
    static String name = "Rectangle";
    @Override
    public void draw() {
        System.out.println("Drawing a " + this.name);
    }
}

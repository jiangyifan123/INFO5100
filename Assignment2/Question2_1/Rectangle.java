package Question2_1;

public class Rectangle extends Shape{
    int width, height;
    public Rectangle(int side) {
        this("", "", side, side);
    }

    public Rectangle(int width, int height) {
        this("", "", width, height);
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color, 2 * (width + height), width * height);
    }

    public String printShape(){
        return "The " + this.name + " has a " + this.color + " color";
    }
}

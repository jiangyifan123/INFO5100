package Question5_2;

public class ShapeMaker {
    private static Circle cicle = new Circle();
    private static Rectangle rectangle = new Rectangle();
    private static Square square = new Square();

    public void drawCircle() {
        cicle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}

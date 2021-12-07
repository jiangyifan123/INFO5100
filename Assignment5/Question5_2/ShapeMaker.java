package Question5_2;

public class ShapeMaker {
    private static Circle cicle;
    private static Rectangle rectangle;
    private static Square square;
    ShapeMaker(){
        this.cicle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

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

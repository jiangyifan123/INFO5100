package Question2_1;

public class Square extends Shape{
    int side;
    public Square(int side){
        this("", "", side);
    }
    public Square(String name, String color, int side) {
        super(name, color, 4 * side, side * side);
        this.side = side;
    }
    public String printShape(){
        return "The " + this.name + " has a " + this.color + " color";
    }
}

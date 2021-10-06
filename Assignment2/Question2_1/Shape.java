package Question2_1;

public class Shape{
    public String name, color;
    private int area, perimeter;
    public Shape(String name, String color){
        this(name, color, 0, 0);
    }
    public Shape(String name, String color, int perimeter, int area){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public int getArea(){
        return this.area;
    }
    public int getPerimeter(){
        return this.perimeter;
    }
    public String printShape(){
        return "The " + this.name + " has a " + this.color + " color";
    }
}

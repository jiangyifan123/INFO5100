package Question5_1;

public class BasicCar implements ICar {
    static String name = "Basic Car.";
    BasicCar(){}
    @Override
    public void assemble() {
        System.out.print(this.name);
    }
}

package Question5_1;

public class BasicCar implements ICar {
    static String name = "Basic Car.";
    BasicCar(){
        System.out.print(this.name);
    }
    @Override
    public void assemble() {

    }
}

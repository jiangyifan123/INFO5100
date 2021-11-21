package Question5_1;

import Question5_1.ICar;

public class SportsCar implements ICar {
    static String name = "Sports Car.";
    public SportsCar(ICar basicCar) {
        System.out.print(" Adding features of " + this.name);
    }

    @Override
    public void assemble() {

    }
}

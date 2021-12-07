package Question5_1;

import Question5_1.ICar;

public class SportsCar extends CarDecorator {
    static String name = "Sports Car.";
    public SportsCar(ICar basicCar) {
        this.car = basicCar;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of " + this.name);
    }
}

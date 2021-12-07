package Question5_1;

import Question5_1.CarDecorator;

public class LuxuryCar extends CarDecorator {
    static String name = "Luxury Car.";
    public LuxuryCar(ICar basicCar) {
        this.car = basicCar;
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of " + this.name);
    }
}

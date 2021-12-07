package Question5_1;

import Question5_1.ICar;

public class SportsCar extends CarDecorator {
    public SportsCar(ICar basicCar) {
        super(basicCar);
        System.out.print(" Adding features of Sports Car.");
    }
}

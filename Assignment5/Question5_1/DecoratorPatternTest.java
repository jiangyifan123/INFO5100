package Question5_1;

import Question5_1.BasicCar;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        ICar sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println();
        ICar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}

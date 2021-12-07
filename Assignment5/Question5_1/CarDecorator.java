package Question5_1;

public class CarDecorator implements ICar {
    ICar car;
    CarDecorator(ICar basicCar){
        this.car = basicCar;
    }
    @Override
    public void assemble() {

    }
}

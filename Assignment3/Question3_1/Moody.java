package Question3_1;

public abstract class Moody {
    abstract String getMood();
    abstract void ExpressFeeling();

    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }
}

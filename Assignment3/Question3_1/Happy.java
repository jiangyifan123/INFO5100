package Question3_1;

public class Happy extends Moody{
    @Override
    String getMood() {
        return "happy";
    }

    @Override
    void ExpressFeeling() {
        System.out.println("heeehee….hahahah…HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}

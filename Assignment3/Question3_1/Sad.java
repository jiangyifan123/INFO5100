package Question3_1;

public class Sad extends Moody{
    @Override
    String getMood() {
        return "sad";
    }

    @Override
    void ExpressFeeling() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}

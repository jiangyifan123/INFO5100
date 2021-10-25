package Question3_1;

public class Psychiatrist{
    public void examine(Moody moodyObject){
        moodyObject.queryMood();
    }
    public void observe(Moody moodyObject){
        moodyObject.ExpressFeeling();
    }
    public String toString(){
        return "Subject laughs a lot";
    }
}

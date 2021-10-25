package Question3_1;

public class Question3_1 {
    public static void main(String[] args) {
        System.out.println("How are you feeling today?");
        Psychiatrist p = new Psychiatrist();
        Happy happy = new Happy();
        Sad sad = new Sad();
        p.examine(happy);
        System.out.println();
        happy.ExpressFeeling();
        System.out.println("Observation:" + happy);
        System.out.println();
        System.out.println("How are you feeling today?");
        p.examine(sad);
        System.out.println();
        sad.ExpressFeeling();
        System.out.println("Observation:" + sad);
    }
}

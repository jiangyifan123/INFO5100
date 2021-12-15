public class Final_1 {
    public static void Runtest(){
        Roomba Robot = new Roomba(new int[][]{
                {0,1,1},
                {0,1,1},
                {1,0,0},
        });
        System.out.println(Robot.move());
        Robot.clean();
        System.out.println(Robot.move());
        System.out.println(Robot.move());

        Roomba Robot2 = new Roomba(new int[][]{
                {0,-1,1},
                {0,-1,1},
                {-1,0,0},
        });
        System.out.println(Robot2.move());
        Robot2.turnLeft();
        System.out.println(Robot2.move());
    }
    public static void main(String[] args) {
        Runtest();
    }
}

public class Roomba implements iRobot{
    private int[][] room;
    private int nowx;
    private int nowy;
    Direction curDirection = Direction.DOWN;

    int[][] getRoom(){
        return room;
    }

    int getNowx(){
        return nowx;
    }

    int getNowy(){
        return nowy;
    }

    Direction getCurDirection(){
        return curDirection;
    }

    Roomba(int[][] room){
        this.room = room;
        nowx = 0;
        nowy = 0;
    }

    @Override
    final public boolean move() {
        int row = room.length;
        int col = room.length;
        int tx = nowx, ty = nowy;
        switch (curDirection){
            case UP:
                tx--;
                break;
            case DOWN:
                tx++;
                break;
            case LEFT:
                ty--;
                break;
            case RIGHT:
                ty++;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + curDirection);
        }
        if(tx < 0 || tx >= row || ty < 0 || ty >= col || room[tx][ty] == -1)
            return false;
        nowx = tx;
        nowy = ty;
        return true;
    }

    @Override
    final public void turnLeft() {
        switch (curDirection){
            case UP:
                curDirection = Direction.LEFT;
                break;
            case DOWN:
                curDirection = Direction.RIGHT;
                break;
            case LEFT:
                curDirection = Direction.DOWN;
                break;
            case RIGHT:
                curDirection = Direction.UP;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + curDirection);
        }
    }

    @Override
    final public void trueRight() {
        switch (curDirection){
            case UP:
                curDirection = Direction.RIGHT;
                break;
            case DOWN:
                curDirection = Direction.LEFT;
                break;
            case LEFT:
                curDirection = Direction.UP;
                break;
            case RIGHT:
                curDirection = Direction.DOWN;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + curDirection);
        }
    }

    @Override
    final public void clean() {
        room[nowx][nowy] = 1;
    }
}

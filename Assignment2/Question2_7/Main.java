package Question2_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int MAXX = matrix.length, MAXY = matrix[0].length;
        int[][] mp = new int[MAXX][MAXY];
        List<Integer> ans = new ArrayList<>();
        int x = 0, y = 0, idx = 0, BlockCnt = 0, dx, dy;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        ans.add(matrix[x][y]);
        mp[x][y] = 1;
        while(BlockCnt < 4){
            dx = direction[idx][0] + x;
            dy = direction[idx][1] + y;
            while(dx >= 0 && dx < MAXX && dy >= 0 && dy < MAXY && mp[dx][dy] == 0){
                x = dx;
                y = dy;
                dx += direction[idx][0];
                dy += direction[idx][1];
                mp[x][y] = 1;
                ans.add(matrix[x][y]);
            }
            BlockCnt = 1;
            idx = (idx + 1) % 4;
            dx = direction[idx][0] + x;
            dy = direction[idx][1] + y;
            while(BlockCnt < 4 && (dx < 0 || dx >= MAXX || dy < 0 || dy >= MAXY || mp[dx][dy] != 0)){
                BlockCnt += 1;
                idx = (idx + 1) % 4;
                dx = direction[idx][0] + x;
                dy = direction[idx][1] + y;
            }
        }
        return ans;
    }

    public static void printarray(List<Integer> array){
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printarray(spiralOrder(matrix));
        int[][] matrix2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        printarray(spiralOrder(matrix2));
    }
}

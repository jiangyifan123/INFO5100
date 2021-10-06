package Question2_3;

public class Main {
    public static int[][] solution(int[][] matrix){
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void printarray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix2 = {{1,2,3}, {4,5,6}};
        int[][] ans = solution(matrix);
        printarray(ans);
        ans = solution(matrix2);
        printarray(ans);
    }
}

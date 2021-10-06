package Question2_6;

public class Main {
    public static void rotate(int[][] matrix) {
        int n = matrix.length, tmp;
        for(int i = 0, j = n-1; i < j; i++, j--){
            for(int k = i; k < j; k++){
                tmp = matrix[n-1-k][i];
                matrix[n-1-k][i] = matrix[n-1-i][n-1-k];
                matrix[n-1-i][n-1-k] = matrix[k][n-1-i];
                matrix[k][n-1-i] = matrix[i][k];
                matrix[i][k] = tmp;
            }
        }
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
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        rotate(matrix2);
        printarray(matrix);
        printarray(matrix2);
    }
}

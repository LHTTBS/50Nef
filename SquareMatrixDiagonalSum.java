import java.util.Scanner;

public class SquareMatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入方阵的阶数n：");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("请输入方阵的元素：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i]; // 主对角线元素之和
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // 副对角线元素之和
        }
        
        System.out.println("主对角线元素之和为：" + mainDiagonalSum);
        System.out.println("副对角线元素之和为：" + secondaryDiagonalSum);
    }
}
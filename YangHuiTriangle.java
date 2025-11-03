public class YangHuiTriangle {
    public static void main(String[] args) {
        int rows = 10; // 输出10行杨辉三角
        int[][] triangle = new int[rows][];
        
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // 每行的第一个元素为1
            triangle[i][i] = 1; // 每行的最后一个元素为1
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        
        // 输出杨辉三角
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
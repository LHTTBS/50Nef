  
    import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("请输入10个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        
        System.out.println("最大值为：" + max + "，下标为：" + maxIndex);
        System.out.println("最小值为：" + min + "，下标为：" + minIndex);
    }
}

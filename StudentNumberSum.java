import java.util.Scanner;
public class StudentNumberSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // 提示用户输入学号
            System.out.print("请输入你的学号：");
            String studentNumber = scanner.nextLine();

            // 获取学号的后三位
            if (studentNumber.length() < 3) {
                System.out.println("学号长度不足三位，无法获取后三位数字！");
                return;
            }
            String lastThree = studentNumber.substring(studentNumber.length() - 3);
            // 解释：
            // studentNumber.length()获取字符串的长度。
            // substring(startIndex)方法从指定索引开始提取字符串，直到字符串的末尾。
            // studentNumber.length() - 3计算后三位的起始索引。

            // 计算后三位数字的立方和
            int sum = 0;
            for (int i = 0; i < lastThree.length(); i++) {
                char c = lastThree.charAt(i);
                if (Character.isDigit(c)) {
                    int digit = Integer.parseInt(String.valueOf(c));

                        //                     解释：
                        // String.valueOf(c)将字符转换为字符串。 
                        // Integer.parseInt()将字符串转换为整数。
                    sum += digit * digit * digit; // 计算立方并累加
                } else {
                    System.out.println("学号中包含非数字字符！");
                    return;
                }
            }

            // 输出结果
            System.out.println("学号的后三位是：" + lastThree);
            System.out.println("后三位数字的立方和是：" + sum);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

// import java.util.Scanner;

// public class StudentIdSum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // 提示用户输入学号
//         System.out.print("请输入你的学号：");
//         int studentId = scanner.nextInt();

//         // 获取学号的后三位数字
//         int lastThreeDigits = studentId % 1000;

//         // 分别获取个位、十位、百位数字
//         int digit1 = lastThreeDigits % 10; // 个位
//         int digit2 = (lastThreeDigits / 10) % 10; // 十位
//         int digit3 = (lastThreeDigits / 100) % 10; // 百位

//         // 计算立方和
//         int sum = digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3;

//         // 输出结果
//         System.out.println("学号的后三位数字是：" + lastThreeDigits);
//         System.out.println("这三位数字的立方和是：" + sum);

//         scanner.close();
//     }
// }vv
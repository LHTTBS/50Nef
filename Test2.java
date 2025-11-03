public class Test2 {
    public static void main(String[] args) {
        // 学号和姓名
        String studentID = "241732431"; // 替换为你的学号
        String name = "黎悦濠"; // 替换为你的姓名
        String major = "软件工程"; // 替换为你的姓名
        String wishes = "前程似锦，好运常伴！"; // 替换为你的姓名
        // 假设本科学制为4年，计算毕业年份
        int enrollmentYear = Integer.parseInt(studentID.substring(0, 2)); // 从学号中提取入学年份
        int graduationYear = enrollmentYear + 2004; // 计算毕业年份

        // 输出信息
        System.out.println("学号: " + studentID);
        System.out.println("姓名: " + name);
        System.out.println("就读专业: " + major);
        System.out.println("本科毕业年份: " + graduationYear);
        System.out.println("祝福你: " + wishes);
        
    }
}
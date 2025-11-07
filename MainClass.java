// 编写接口 Parents
interface Parents {
    void hobby();
    void birthday();
}
class Father implements Parents {
    public void hobby() {
        System.out.println("爸爸的爱好是健身");
    }
    public void birthday() {
        System.out.println("爸爸的生日是 12 月 1 日");
    }
}
class Mother implements Parents {
    public void hobby() {
        System.out.println("妈妈的爱好是做好吃的");
    }

    public void birthday() {
        System.out.println("妈妈的生日是 10 月 12 日");
    }
}

class ViewParents {
    public void view(Parents parent) {
        parent.hobby();
        parent.birthday();
    }
}

// 编写主类 MainClass
public class MainClass {
    public static void main(String[] args) {
        ViewParents vp = new ViewParents();

        Father father = new Father();
        vp.view(father);

        System.out.println();

        Mother mother = new Mother();
        vp.view(mother);
    }
}
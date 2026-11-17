package purplebook.chap05;

class Test0 {
    static {
        System.out.println("Test클래스 : static 이니셜라이져");
    }

    Test0() {
        System.out.println("Test클래스 : 생성자");
    }
}

public class ex03Main {
    static {
        System.out.println("Main클래스 : static 이니셜라이져");
    }

    public static void main(String[] args) {
        System.out.println("Main클래스 : main() 메서드");
        Test0 obj = new Test0();
    }
}

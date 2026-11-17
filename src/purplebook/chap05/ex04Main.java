package purplebook.chap05;

class Test00 {
    void method1(int num) {                 // 인수로서 기본형을 받는다.
        num += 10;
        System.out.println("정의예 " + num);
    }
    void method2(int[] array) {             // 인수로서 참조형을 받는다.
        array[0] += 10;
        System.out.println("정의예 " + array[0]);
    }
}

public class ex04Main {
    public static void main(String[] args) {
        int num = 10;
        int[] array = { 10 };
        Test00 obj = new Test00();
        obj.method1(num);
        System.out.println("호출하는 쪽 " + num);
        obj.method2(array);
        System.out.println("호출하는 쪽 " + array[0]);
    }
}

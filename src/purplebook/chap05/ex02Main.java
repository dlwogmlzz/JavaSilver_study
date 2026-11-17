package purplebook.chap05;

class Test2 {
    public void method(int a) {
        System.out.println("method(int a)");
    }
    public void method(long a) {
        System.out.println("method(long a)");
    }
    public void method(Integer a) {
        System.out.println("method(Integer a)");
    }
    public void method(int... a) {
        System.out.println("method(int... a)");
    }
//    public void method(int[] a) {
//        System.out.println("method(int[] a)");
//    }

}
public class ex02Main {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.method(100);
    }
}

package staticvariable_staticmethod;

class Test {
    static {
        System.out.println("3番.Testクラス : staticイニシャライザ"); //　④Test클래스에서 먼저실행됨
    }
    Test(){
        System.out.println("4番.Testクラス : コンストラクタ"); //　⑤그다음 실행됨.
    }
}

public class StaticTest {
    static {   // ①main 메서드 보다 먼저 실행됨
        System.out.println("1番.Mainクラス : staticイニシャライザ");
    }
    public static void main(String[] args){
        System.out.println("2番.Mainクラス : Mainメソッド"); // ②그다음 main 메서드가 실행됨.
        Test obj = new Test(); // ③이때 Test클래스를 객체 생성함.
    }
}

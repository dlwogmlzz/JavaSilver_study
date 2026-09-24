[static 변수와 static 메서드란]
- static = 静的 (정적), 클래스에 대해, 정적으로 존재하는 멤버를 나타낸다.

[표 구조]
- 인스턴스 멤버 | 멤버 변수: 인스턴스 변수 | 멤버 메서드: 인스턴스 메서드
- static 멤버 | static 변수 | static 메서드

- 인스턴스 멤버는, 복수 인스턴스화해서, 각 오브젝트에 멤버를 유지하는 것에 대해서, 
  static 멤버는 인스턴스 멤버와는 다른 장소에 1곳에 모아서 보관된다.


[static 변수와 static 메서드의 호출]
- 인스턴스 멤버와 달리, `인스턴스화하지 않아도 호출이 가능`

[呼び出し方 (호출 방법)]
- クラス名.static変数名
- クラス名.staticメソッド名()



[동일 클래스 내에서의 접근]

[ルール (규칙)]
【直接アクセス可能 (직접 접근 가능)】
- インスタンスメソッド ⇒ インスタンス変数 (인스턴스 메서드 ⇒ 인스턴스 변수)
- インスタンスメソッド ⇒ staticメソッド (인스턴스 메서드 ⇒ static 메서드)
- staticメソッド ⇒ static変数 (static 메서드 ⇒ static 변수)

【直接アクセス不可 (직접 접근 불가)】
- staticメソッド ⇒ インスタンスメソッド (static 메서드 ⇒ 인스턴스 메서드)
  ※ インスタンス化しないとアクセスできない (※ 인스턴스화하지 않으면 접근할 수 없다)


class TestClass {
    `// 인스턴스 변수`
    int instanceVar = 10;
    `// static 변수`
    static int staticVar = 20;
    `// 인스턴스 메서드`
    void instanceMethod() {
        System.out.println("인스턴스 메서드 실행");
    }
    `// static 메서드`
    static void staticMethod() {
        System.out.println("static 메서드 실행");
    }
    // ==========================================
   `// 1. 【直接アクセス可能 (직접 접근 가능)】`
    // ==========================================
    void testAccessible() {
        `// ① 인스턴스 메서드 ⇒ 인스턴스 변수 접근 가능`
        System.out.println(instanceVar);
        `// ② 인스턴스 메서드 ⇒ static 메서드 호출 가능`
        staticMethod();
        `// ③ static 메서드 내부가 아니더라도, 인스턴스 멤버끼리는 자유롭게 접근 가능합니다.`
    }
    static void testStaticAccessible() {
        `// ④ static 메서드 ⇒ static 변수 접근 가능`
        System.out.println(staticVar);
    }
    // ==========================================
    // `2. 【直接アクセス不可 (직접 접근 불가)】`
    // ==========================================
    static void testInaccessible() {
        `// ❌ 컴파일 에러 발생!
        // static 메서드 ⇒ 인스턴스 메서드(또는 인스턴스 변수)에 직접 접근할 수 없음
        // System.out.println(instanceVar); // 에러!
        // instanceMethod();                // 에러!
        // [해결 방법] 
        // ※ 인스턴스화하지 않으면 접근할 수 없다`
        TestClass obj = new TestClass();
        System.out.println(obj.instanceVar); `// 객체를 생성(인스턴스화)하면 접근 가능`
        obj.instanceMethod();                `// 객체를 생성하면 호출 가능`
    }
}



[staticイニシャライザ (static 초기화 블록)]
- クラスファイルがロードされたタイミングで実行されるブロックのこと
  (클래스 파일이 로드된 타이밍에 실행되는 블록을 말함)
- クラスのインスタンス化前や、メインメソッド呼び出し前に実行したい処理に使用する
  (클래스의 인스턴스화 전이나, 메인 메서드 호출 전에 실행하고 싶은 처리에 사용한다)


[static 초기화 블록 예시]

[例 (예)]
class Test {
    `static {
        System.out.println("Testクラス : staticイニシャライザ"); //　④Test클래스에서 먼저실행됨
    }`
    Test(){
        System.out.println("Testクラス : コンストラクタ"); //　⑤그다음 실행됨.
    }
}

public class Main{
    `static {   // ①main 메서드 보다 먼저 실행됨
        System.out.println("Mainクラス : staticイニシャライザ");
    }`
    Public static void main(String[] args){
        System.out.println("Mainクラス : Mainメソッド"); // ②그다음 main 메서드가 실행됨.
        Test obj = new Test(); // ③이때 Test클래스를 객체 생성함.
    }
}

[Point / 実行結果 (실행 결과)]
Mainクラス : `staticイニシャライザ`
Mainクラス : Mainメソッド
Testクラス : `staticイニシャライザ`
Testクラス : コンストラクタ
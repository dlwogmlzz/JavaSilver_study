[オーバーライドとは (오버라이드란)]
- 서브 클래스 내에서 슈퍼 클래스의 메서드와 같은 이름의 메서드를 재정의하는 것

[オーバーロードとオーバーライドの違い (오버로드와 오버라이드의 차이)]
- 오버로드(다중 정의): 클래스 내에서 `메서드를 다중으로 정의`하는 것
- 오버라이드(덮어쓰기 정의): 상속 원본 클래스의 메서드를 `상속 대상 클래스에서 재정의`하는 것


[Overrideアノテーション (Override 어노테이션)]
- アノテーション (annotation: 주석) : 프로그램에 대해 메타데이터를 부여

[Overrideアノテーション의 특징]
- java.lang 패키지에 정의되어 있는 표준 어노테이션
- 「@Override」と記載 ("@Override"라고 기재)

[코드 예시]
- Super Class:
  class SubA extends SuperA {
  void testA()
  }

- Sub Class:
  class SubB extends SubA {
  @Override
  void testa() // 실수해서 A를 소문자로
  }

[Point]
- Override 어노테이션을 부여하면 오버라이드되어 있지 않은 경우 컴파일 시 검출할 수 있다


[서브 클래스에서의 멤버 이용에 대해]

[static 멤버의 재정의]
⇒ ◯ static 멤버를 static 멤버로 재정의
　X static 멤버를 인스턴스 멤버로 재정의
　X 인스턴스 멤버를 static 멤버로 재정의

[final修飾子 (final 수식어)]
⇒ 변수뿐만 아니라, 클래스나 메서드에도 적용할 수 있다
　X final 수식어가 붙은 클래스를 상속 
　X final 수식어가 붙은 메서드를 오버라이드


[this & super의 이용]

`this`
　⇒ 자신의 객체가 보유한 멤버를 명시적으로 지정

`super`
  ⇒ 자신의 객체에서 보았을 때, 슈퍼 클래스의 객체를 지정


[スーパークラス (슈퍼 클래스)]
public class SuperTest {
    // 인수 없는 생성자
    public SuperTest() {
        System.out.println("인수 없는 생성자");
    }
    // 인수 있는 생성자
    public SuperTest(String str) {
        System.out.println("인수 있는 생성자");
    }
}

[サブクラス (서브 클래스)]
public class SuperTest2 extends SuperTest {
    // this를 사용한 생성자
    public SuperTest2() {
        this`("자식 생성자1")`;
        System.out.println("자식 생성자2");
    }
    // super を使ったコンストラクタ (super를 사용한 생성자)
    public SuperTest2(String str) {
        super("");
        System.out.println`(str)`;
    }
}

[出力結果 (출력 결과)]
"인수 있는 부모 생성자", "자식 생성자1", "자식 생성자2" 순으로 표시
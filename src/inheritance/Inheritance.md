[継承とは (상속이란)]
⇒ 기존 클래스를 바탕으로 새로운 클래스를 정의하는 것
  기반이 되는 클래스를 `슈퍼 클래스`, 새롭게 정의되는 클래스를 `서브 클래스`라고 부른다

[サブクラス定義の構文 (서브 클래스 정의 구문)]
修飾子 class サブクラス名 extends スーパークラス名 {}

[例 (예)]
class Student{} // スーパークラス (슈퍼 클래스)
class Test extend Student{} // サブクラス (서브 클래스)

[Point]
`extendキーワードで継承できる` (extend 키워드로 상속할 수 있다)


[継承とは (상속이란)]
⇒ 상속하면, 슈퍼 클래스에서 정의한 멤버는 `모두 서브 클래스로 인계`된다

[スーパークラス (슈퍼 클래스)]
class Student{
    int id;
    int getId(){...}
}

[サブクラス (서브 클래스)]
class Test extend Student{
    int score;
    int getScore(){...}
}
※ 서브 클래스로 이용하고 싶은 멤버를 정의

[서브 클래스를 이용하는 클래스]
class Grade{
    Test t = new Test();
    `t.getId(){...}`
    `t.getScore(){...}`
}



[継承とは (상속이란)]
⇒ 서브 클래스로부터 다시 서브 클래스를 정의하거나, 하나의 슈퍼 클래스로부터 복수의 서브 클래스를 정의할 수 있다

[구조 및 예시]
* class SuperA {}
       ↑
       |
* class SubA extends SuperA {} (SuperA를 상속)
       ↑
       |
* class SubB extends SubA {} (SubA를 다시 상속 - 다단 상속 가능)
       ↑
       |
* class SubC extends SuperA {} (SuperA를 상속 - 하나의 슈퍼 클래스에서 여러 서브 클래스 파생 가능)

[주의사항 (NG)]
- 복수의 슈퍼 클래스를 바탕으로 서브 클래스를 정의하는 것은 NG
- (예시 - 오류 발생)
  class SubC extends SubA, SubB{} (X / 다중상속불가!!)

[java.lang.Objectクラス (java.lang.Object 클래스)]
- 모든 객체에 공통으로 제공해야 할 메서드가 정의된 클래스
- extend 키워드를 명시하지 않은 경우, 암묵적으로 java.lang.Object 클래스의 서브 클래스가 된다




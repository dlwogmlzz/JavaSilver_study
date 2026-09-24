[참조형의 타입 변환 규칙]

* **① 암시적 타입 변환**
    * 서브클래스의 객체를 슈퍼클래스의 타입으로 선언한 변수로 다룰 수 있음

* **② 캐스트에 의한 타입 변환**
    * 슈퍼클래스로 선언한 변수를 참조하고 있는 서브클래스의 객체를 서브클래스 타입으로 선언한 변수로 다룸

[변환 방향]
* 암시적 타입 변환 (높은걸로 변환)
    * 서브클래스 ➔ 슈퍼클래스
    * 구현 클래스 ➔ 인터페이스
* 캐스트에 의한 타입 변환(낮은 걸로 변환)
    * 슈퍼클래스 ➔ 서브클래스
    * 인터페이스 ➔ 구현 클래스



[암시적 타입 변환]

<전제>
* 클래스 구조: 클래스 X는 클래스 A를 상속 (`클래스X extends 클래스A`)
* 인터페이스 구조: 클래스 Y는 인터페이스 B를 구현 (`클래스Y implement 인터페이스B`)

1. 상속 관계
   `A a = new X();`

2. 구현 관계
   `B b = new Y();`

3. 메서드의 인수로 이용
    * <호출 측>
      `X x = new X();`
      `method(x);`
    * <정의 측>
      `void method (A a){}`

4. 메서드의 반환값으로 이용
    * <호출 측>
      `B b = method();`
    * <정의 측>
      `B method () { return = new Y(); }`

[Point]
* 암시적 타입 변환은 자동으로 이루어진다



[캐스트에 의한 타입 변환]

* **이용 국면**
    * "클래스를 인스턴스화" ⇒ "상속 관계가 있는 타입에 대입" ⇒ "원래의 클래스 타입으로 되돌린다"는 국면에서 이용됨

1. **상속 관계**
   ```java
   A a = new X();
   X x = (X) a;
   ```

2. **구현 관계**
   ```java
   B b = new Y();
   Y y = (Y) b;
   ```

3. **메서드의 인수로 이용**
    * <호출 측>
      ```java
      X x = new X();
      method(x);
      ```
    * <정의 측>
      ```java
      void method (A a) {
          X x = (X) a;
      }
      ```

4. **메서드의 반환값으로 이용**
    * <호출 측>
      ```java
      B b = method();
      Y y = (Y) b;
      ```
    * <정의 측>
      ```java
      B method () {
          return new Y();
      }
      ```

[Point]
* 상속 관계가 없는 타입으로 캐스트하려고 한 경우에는, `실행 시에 ClassCastException이라는 에러가 발생`한다



[참조형의 타입 변환 주의점]

* **핵심 내용**
  * 슈퍼클래스에 있는 private 멤버는 서브클래스에 상속되지 않는다

* **코드 예시 (클래스 정의 및 Main)**
  ```java
  // 부모 클래스 A 정의
  class A {
      private void foo() {
          System.out.println("A");
      }
  }

  // 부모 클래스 A를 상속한 자식 클래스 B 정의
  class B extends A {
      void foo() {
          System.out.println("B");
      }
  }

  // 부모 클래스 타입의 자식 클래스 객체를 생성 및 이용
  public class Main {
      public static void main(String[] args) {
          A obj = new B();
          obj.foo(); // コンパイルエラー (컴파일 에러)
      }
  }
  ```

* **Point**
  * 암시적 타입 변환 시에는 상속 관계가 있으므로 문제가 없지만, foo 메서드에 접근할 때 
    `부모 클래스의 수식어가 private`이므로 접근할 수 없어 `컴파일 에러가 발생`한다




[참조형의 타입 변환 주의점]

* **클래스 정의 (クラス定義)**
  ```java
  class Super {}
  class Sub extends Super {}
  class Foo {}
  ```

* **정의한 클래스 이용 및 타입 변환 케이스 (定義したクラスを利用)**
    * `Super obj1 = new Sub();`
    * `Sub sub1 = (Sub)obj1; // OK`
     
    * `Foo obj2 = new Foo();`
    * `Sub sub2 = (Sub)obj2; // コンパイルエラー (SubとFooに継承関係がない)`
     
    * `Super obj3 = new Super();`
    * `Sub sub3 = (Sub)obj3; // 実行時エラー (SubとSuperに継承関係があるがobj3が参照しているのはSuper)`


[Object형의 취급]

* **핵심 내용**
    * 참조형에는 `클래스, 인터페이스, 배열`이 포함되며, 모든 참조형 데이터는 `Object 클래스를 슈퍼클래스로 가진다`

* **예시 ① (클래스 정의 및 Object형으로 다루기)**
  ```java
  // 클래스를 정의
  class Foo {}

  // 정의한 클래스를 Object형으로 다룸.
  Object obj = new Foo();
  ```

* **예시 ② (배열 정의 및 Object형으로 다루기)**
  ```java
  // 배열을 정의
  int[] array = {1, 2, 3};

  // 정의한 배열을 Object형으로 다룸.
  Object obj = array;
  ```

* **Point**
    * `참조형 데이터는 Object형으로 암시적 타입 변환을 할 수 있다`



[instanceof 연산자 (instanceof演算子)]

* **정의 (意味)**
  * 어떤 특정한 객체가 특정한 타입을 가지는지 판정하고, boolean형으로 결과를 반환

* **구문 (構文)**
  `参照変数名 instanceof クラス名orインターフェース名`

* **코드 예시 (例)**
  ```java
  public class Main {
      public static void main(String[] args) {
          Object obj = "Amegon";
          System.out.println(obj instanceof String); // trueを返す
          System.out.println(obj instanceof Integer); // falseを返す
      }
  }
  ```

* **Point**
  * 참조 변수명에 지정한 것이 서브클래스나 구현 클래스이면 true를 반환
  * 상속 관계가 전혀 없는 것끼리 비교한 경우는 컴파일 에러가 된다

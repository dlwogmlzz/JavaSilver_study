# 함수형 인터페이스란

⇒ 정의되어 있는 `추상메서드가 1개만의 인터페이스`인것
  주된 함수형 인터페이스는, java.util.function 패키지로서 제공되어 있다.


* **주요 함수형 인터페이스 목록**
    - **Function<T, R>**
        - 추상 메서드: `R apply(T t)`
        - 개요: 인수의 타입을 T, 반환값의 타입을 R로 설정하고 결과를 받는 인터페이스
    - **Comsumer<T>**
        - 추상 메서드: `void accept(T t)`
        - 개요: 인수의 타입을 T로 설정하고 결과는 반환하지 않는 인터페이스
    - **Predicate<T>**
        - 추상 메서드: `boolean test(T t)`
        - 개요: 인수의 타입을 T, 인수를 t로 설정하여 결과로서 boolean 값을 반환하는 인터페이스
    - **Supplier<T>**
        - 추상 메서드: `T get()`
        - 개요: 인수는 받지 않고, 반환값의 타입을 T로 지정하여 결과를 받는 인터페이스


[람다식이란 (ラムダ式とは)]

* **개념 및 특징**
    - Java 8부터 추가된 프로그램 기술 방식으로, 기존 기술 방식보다 간단하게 프로그램을 작성할 수 있음
    - 인터페이스를 이용할 때, 구현 클래스를 생성하지 않고 직접 인스턴스화한 객체를 생성하여 변수에 격납하는 것이 가능

* **구문 (構文)**
    - (引数の型名 抽象メソッドの引数名) -> { return 戻り値; }

* **Point**
    - 화살표 연산자(->)를 사용하여 처리를 기술함


소스코드 예
```java
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Function 인터페이스와 람다식을 이용한 객체 생성 (생략 없는 구현)
        Function<String, String> obj = (String str) -> {
            return "Hello " + str;
        };
        String str = obj.apply("tanaka");
        System.out.println(str);
    }
}
```


```java
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 인수의 괄호, 중괄호, return 키워드가 생략된 람다식 구현
        Function<String, String> obj = str -> "Hello " + str;
        
        String str = obj.apply("tanaka");
        System.out.println(str);
    }
}


```

[람다식의 포인트]

* ① 람다식 내의 변수는 `반드시 final`이어야 한다
* ② 변수의 이름으로, `이미 코드 내에서 정의된 변수 이름을 사용할 수 없다`
* ③ 인수의 타입을 지정하는 경우, `인수의 ()는 생략할 수 없다`
    - 예: NG ⇒ String x, Ok ⇒ (String x)
* ④ 인수를 여러 개 설정하는 경우, `한쪽만 타입을 정의하거나 묶어서 타입을 정의할 수 없다`
    - 예: NG ⇒ (int x, y), Ok ⇒ (int x, int y) 혹은 (x, y)
* ⑤ `처리가 1문장일 때만, {}과 return을 생략 가능`
    - {}과 return을 어느 한쪽만 생략할 수는 없다



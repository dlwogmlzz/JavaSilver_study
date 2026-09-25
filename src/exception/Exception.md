[예외란 (例外とは)]

* **예외**
    - 프로그램 실행 시에 발생한 에러
    - 예외가 발생하는 것을 `예외가 스로우(throw)된다고` 함

* **Point**
    - ① 예외를 스로우하기
    - ② 예외를 캐치(catch)하기

* **예외 발생 시의 움직임**
    - ① Java 언어에서는 프로그램 실행 시에 에러가 발생한 경우, `Java 실행 환경(JVM)이 예외를 스로우함`
    - ② 예외를 발생시킨 프로그램은 `예외를 캐치하여 에러 발생을 감지함`

    
[예외 처리란 (例外処理とは)]

* **예외 처리의 필요성**
    - 예외가 발생했을 때, 프로그램 측에서 발생한 예외에 대한 처리를 기술해 두지 않으면 프로그램이 강제 종료되어 버림
    - 실행 시에 상정되는 에러를 미연에 방지하기 위해 Java 언어에서는 예외 처리를 이용함



[예외 클래스란]

* **예외 클래스 정의**
    - 예외가 발생했을 경우의 회피책을 정리한 클래스
    - 예외 클래스는 크게 나누어 unchecked 클래스와 checked 클래스로 분류됨

* **checked 클래스(Exception)**
    - `Java 실행 환경 이외가 원인`으로 발생하는 예외
    - 예외 처리 기재가 `필수`

* **unchecked 클래스(RuntimeException)**
    -` 프로그램의 내용이 원인`이 되어 일어나는 예외
    - 예외 처리 기재는 `임의`



[例外クラスとは (예외 클래스 구조도)]

* 범례
    - [베이지색 박스] ⇒ unchecked 예외 (unchecked例外)
    - [파란색 박스] ⇒ checked 예외 (checked例外)

* 구조도
  Throwable
  ├── Error [베이지색 박스: unchecked]
  └── Exception
　　　　  ├── [파란색 박스들] (checked 예외 계열)
  　　　　└── RuntimeException [베이지색 박스]
  　　　　　　　　└── [베이지색 박스들] (unchecked 예외 계열)



[例外クラスとは (테스트에 자주 출제되는 예외 클래스 구조도)]

* Point
    - テストで頻出する例外クラス (테스트에 빈출되는 예외 클래스)

* 예외 클래스 계층 구조
  Throwable
  ├── Error
  └── Exception
  　　　　├── IOException
  　　　　│    　└── FileNotFoundException
  　　　　└── RuntimeException
  　　　　　　　├── IndexOutOfBoundsException
  　　　　　　　│    └── ArrayIndexOutOfBoundsException
  　　　　　　　└── ArithmeticException



[실장의 방법 (実装の方法)]

* 예외 처리 구현 방법
    - ① try catch finally 블록을 이용한 예외 처리
    - ② throws 키워드를 이용한 예외 처리



[try catch finally 사용법]

* Point
    - try 블록에서 에러가 발생하면 ⇒ catch 블록 ⇒ finally 블록 순으로 실행
    - try 블록이 문제없이 실행되면 ⇒ finally 블록만 실행


```java
// try catch finally 블록 구조
void method() {
    try {
    // 예외가 발생할 것 같은 처리
    } catch (例外クラス名 変数名) {
    // 예외가 발생했을 때의 처리
    } finally {
    // 반드시 실행하고 싶은 처리
    }
}

```



[복수의 catch 블록 사용법]

* Point
 - catch 블록은 복수 기재가 가능함
 - 복수 사용하는 경우에는, 반드시 서브클래스부터 기술하지 않으면 컴파일 에러가 발생함
 - (예) Exception과 IOException이라면, 서브클래스인 IOException부터 먼저 기술

```java
// 복수의 catch 블록 구조
void method() {
    try {
        // 예외가 발생할 것 같은 처리
    } catch (例外クラス名 変数名) {
        // 예외가 발생했을 때의 처리
    } catch (例外クラス名 変数名) {
        // 예외가 발생했을 때의 처리
    } finally {
        // 반드시 실행하고 싶은 처리
    }
}
```


[throws의 사용법]

* throws 키워드 동작 방식
    - ① 예외가 발생할 가능성이 있는 메서드 정의 시에 예외 클래스를 throws 지정함
    - ② 지정된 예외 클래스의 에러가 메서드 내에서 발생
    - ③ 메서드 호출원으로 전송됨
    - 
      // throws 구문 구조
      접근제어자 반환값타입 메서드명(인수목록) throws 예외클래스명 {}




[throws의 사용법]

* Point
    - catch 블록의 중복을 방지할 수 있음

```java
// throws 활용 예제 (DBAccess 및 test 클래스)
class DBAccess {
    void select(...) throws SQLException {
        // ...
    }
    
    void insert(...) throws SQLException {
        // ...
    }
}

class test {
    void add() {
        DBAccess d = new DBAccess();
        try {
            d.select(...);
            d.insert(...);
        } catch (SQLException e) {
            // error 로그를 취득하는 처리
        }
    }
}

```


[throws의 사용법 - 오버라이드 시의 주의점]

* Point
    - ① throws에 아무것도 지정하지 않아도 OK
    - ② 슈퍼클래스가 throws 지정하고 있는 예외 클래스의 서브클래스를 throws 지정함
    - ③ RuntimeException은 슈퍼클래스에 관계없이 지정해서 OK

```java
// 슈퍼 클래스 (Super クラス)
class Super {
    void method() throws IOException {}
}

// 서브 클래스 올바른 사용 예 (Sub クラス / 正しい使用例)
class Sub extends Super {
    // ① throws를 지정하지 않음
    @Override
    void method() {}

    // ② 슈퍼클래스의 예외(IOException)의 서브클래스(FileNotFoundException)를 지정
    @Override
    void method() throws FileNotFoundException {}

    // ③ 슈퍼클래스와 무관하게 RuntimeException을 지정
    @Override
    void method() throws RuntimeException {}
}
```


[throws의 사용법 - 오버라이드 시의 주의점 (컴파일 에러가 나는 사용례)]

* Point
    - ① 슈퍼클래스가 throws 지정하고 있는 예외 클래스의 슈퍼클래스를 throws 지정하고 있기 때문에 NG
    - ② IOException과 상속 관계가 없는 예외 클래스를 지정하고 있기 때문에 NG


```java
// 슈퍼 클래스 (Super クラス)
class Super {
    void method() throws IOException {}
}

// 서브 클래스 컴파일 에러가 나는 사용례 (Sub クラス / コンパイルエラーになる使用例)
class Sub extends Super {
    // ① 슈퍼클래스의 예외(IOException)의 슈퍼클래스(Exception)를 지정하여 NG
    @Override
    void method() throws Exception {}

    // ② IOException과 상속 관계가 없는 예외(ClassNotFoundException)를 지정하여 NG
    @Override
    void method() throws ClassNotFoundException {}
}
```


[Exception 계층 구조도]

* 구조도
  Exception
  ├── IOException
  │    └── FileNotFoundException
  ├── ClassNotFoundException
  └── RuntimeException



[throw의 사용법]

* throw 키워드 개요
    - throw를 사용하면, Java 언어에서 제공되는 독자 클래스나 예외 클래스를 임의의 장소에서 스로우할 수 있음


// throw 구문 구조 (構文) 및 예시
`throw 예외오브젝트 {}`

// (예 1)
throw new IOException();

// (예 2)
IOException e = new IOException();
throw e;

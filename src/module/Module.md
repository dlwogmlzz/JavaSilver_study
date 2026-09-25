[모듈이란 (モジュールとは)]

* 모듈의 정의 및 특징
    - Java 9부터 도입된 `패키지를 그룹화할 수 있는` 메커니즘을 의미함
    - 패키지 단위로는 접근 제한을 설정할 수 없지만, `모듈을 이용함으로써 클래스보다도 패키지를 세밀하게 관리할 수 있음`



[Java가 제공하는 기본적인 모듈]

* 모듈 목록 및 설명
    - java.base
        * 설명: Java SE Platform의 기반이 되는 API를 정의
        * 함유하는 주요 패키지: java.lang, java.text, java.util
    - java.desktop
        * 설명: AWT와 Swing 등의 GUI 관련 API를 정의
        * 함유하는 주요 패키지: java.awt, javax.swing
    - java.sql
        * 설명: JDBC API를 정의
        * 함유하는 주요 패키지: java.sql, javax.sql


[모듈의 사용법 (モジュールの使い方)]

* 사용 흐름
    - ① 모듈의 선언
    - ② 모듈에 클래스 배치
    - ③ 모듈화된 프로그램의 컴파일
    - ④ 모듈의 실행

[모듈의 사용법 - ① 모듈의 선언]

* 모듈 선언
    - `module-info.java`라는 이름의 파일에 모듈의 이름이나 의존성을 기술하여 선언할 수 있음

// 구문
module 모듈이름 {
}

* Point
    - com.se.sample 모듈은 java.base 모듈에 의존하고 있음
    - java.base는 정의하지 않아도 암묵적으로 정의되기 때문에, 모듈의 내부가 비어 있게 되는 경우도 있음

// 예시
module com.se.sample {
    `requires` java.base;
        ╰모듈 디렉티브: 모듈의 구성 요소나 의존 관계, 엑스포트되는 패키지 등을 정의할 수 있음
}


[모듈의 사용법 - ② 모듈에 클래스 배치]

* 모듈 배치 개요
⇒ com.se.sample 모듈에 메인 클래스를 격납

* Point
    - `모듈 내의 모든 클래스는 패키지화할 필요가 있음`

```java

// 예시
package com.se.sample.main;

public class main {
    public static void main(String[] args) {
        System.out.println("Module System!");
    }
}

```


[모듈의 사용법 - ② 모듈에 클래스 배치 (디렉토리 구조)]

* 디렉토리 구성 예시

(최상위 폴더)
│
└─── <폴더> com.se.sample
│
└─── <폴더> src
　　　　│
　　　　├─── <파일> Main.java
　　　　│
　　　　└─── <파일> module-info.java



[모듈의 사용법 - ③ 모듈화된 프로그램의 컴파일]

* 컴파일 개요
    - javac 명령어에 module-info.java를 포함함
    - 컴파일로 생성된 module-info.class 파일은 `모듈의 루트 디렉토리에 배치`할 필요가 있음

* 구문
    - javac -d <클래스 파일의 생성 장소> <컴파일 대상의 소스 파일>
     
// 명령어 예시
\com.se.sample> javac -d . ..\src\module-info.java ..\src\Main.java




[모듈의 사용법 - ③ 모듈화된 프로그램의 컴파일 (디렉토리 구조)]

* 컴파일 결과 디렉토리 구성 예시

(최상위 폴더)
│
└─── `<폴더> com.se.sample (모듈의 루트 디렉토리)`
│　　　　 │
│　　　　 ├─── `<파일> module-info.class`
│       │
│       ├─── <폴더> com
│              └─── <폴더> se
│                     └─── <폴더> sample
│                            └─── <폴더> main (패키지명에 대응하여 자동 생성됨)
│                                   └─── `<파일> Main.class`
│
└─── <폴더> src
       ├─── <파일> Main.java
       └─── <파일> module-info.java



[모듈의 사용법 - ④ 모듈의 실행]

* 모듈 실행 개요
    - 모듈화된 프로그램을 실행하기 위해 java 명령어를 사용함

* Point
    - 모듈 이름의 지정이 없으면 에러가 발생함

* 구문
    - 기본 구문: java --module-path <모듈의 격납 장소> --module <모듈 이름>/<실행할 클래스 이름>
    - 생략판 구문: java -p <모듈의 격납 장소> -m <모듈 이름>/<실행할 클래스 이름>


// 명령어 예시
\com.se.sample> java --module-path . --module com.se.sample/com.se.sample.main.Main

// 생략판 명령어 예시
java -path . -m com.se.sample/com.se.sample.main.Main



[모듈의 공개]

* 다른 모듈을 이용하는 방법
    - requires로 모듈을 지정함

* 모듈을 공개하고 싶을 때
    - `exports`로 모듈(패키지)을 공개함


```java
// 예시
module com.se.sample {
    requires java.base;
    exports com.se.sample.main;
}
```



[모듈의 종류]

* Point
    - 모듈 이름을 가짐 = module-info.class가 존재함
    - 모듈 패스 = 모듈의 검색처를 나타내는 패스를 뜻함

* `이름 있는 모듈`
    - 모듈 패스 상에 존재하고, 모듈 이름을 가짐

* `무명 모듈`
    - 클래스 패스 상에 존재하고, 모듈 이름을 가지지 않음

* `자동 모듈`
    - 모듈 패스 상에 존재하고, 모듈 이름을 가지지 않음

* 무명 모듈과 자동 모듈의 특징
    - 모든 패키지를 exports함
    - 모듈 패스 상의 모든 모듈을 requires함

    
[모듈 그래프]

* 모듈 그래프 개요
  - 모듈 간의 의존 관계를 그림으로 표현한 것
  - 그래프의 선두가 되는 모듈을 `루트 모듈`이라고 부름

* 의존 관계 구조 예시
    - foo 모듈 (루트 모듈)
      └─── bar 모듈
            ├─── fizz 모듈
            └─── buzz 모듈

// 예시
module foo {
    `requires` bar;
}

module bar {
    `requires` fizz;
    `requires` buzz;
}


[java.base 모듈도 포함된 모듈 그래프]

* 모듈 그래프 구성 예시
    - foo 모듈 (루트 모듈)
       └─── bar 모듈
             ├─── fizz 모듈 (java.base 모듈에 의존)
             └─── buzz 모듈 (java.base 모듈에 의존)
               └─── java.base 모듈 (모든 모듈이 암묵적으로 의존함)

// 예시 코드
module foo {
    requires bar;
}

module bar {
    requires fizz;
    requires buzz;
}



[모듈 그래프 - 간접 익스포트]

* Point
    - bar 모듈을 간접 익스포트하고 있으면, 
    - foo 모듈에서도 fizz와 buzz가 참조될 수 있게 됨

* 의존 관계 구조 예시
    - foo 모듈 (루트 모듈)
       └─── bar 모듈
             ├─── <<transitive>> fizz 모듈 (간접 익스포트 적용)
             └─── <<transitive>> buzz 모듈 (간접 익스포트 적용)

// 예시 코드
module foo {
    requires bar;
}

module bar {
    requires transitive fizz;
    requires transitive buzz;
}

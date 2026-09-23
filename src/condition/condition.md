# 조건분기
⇒ 소스코드 안에 있는 조건 마다 처리내용을 나누기 위해 사용

Java 언어에서 준비 되어있는 조건 분기문
     ╰if문
     ╰switch문


삼항 연산자
조건식 ? 식1 : 식2;
age <= 20 ? "20살 미만입니다." : "20살 넘었습니다."

■switch문
⇒ 다분기 처리를 할때 사용하는 조건분분기

예1
switch(식) {
    case 정수1:   // 식의 결과가 정수1과 일치할 때, 처리문1을 실행
    처리문1;
    case 정수2:   // 식의 결과가 정수2과 일치할 때, 처리문2을 실행
    처리문2;
    break;       // break문이 있으면, 처리문2를 실행후, switch문에서 빠져나옴.
    default:     // 어떤 case에도 일치하지 않았을 경우, default 처리문을 실행
    default의 처리문;
}
※enum(열거형)은, 복수의 정수를 하나에 모아두는 것이 가능한 형

💡Point💡
default의 위치는 어디라도 OK, break가 있으면, switch문에서 빠져나옴.

💡Point💡 
    ・식의 결과 데이터형
      ⇒ char, byte, short, int 또는 그 wrapper class, enum, String
      위 이외에는 컴파일에러

・case에 지정할 수 있는 값은 정수 만



예2
switch(num) {
    case 1: System.out.println("num=1");
    break;
    case 2: System.out.println("num=2");
    default: System.out.println("default");

💡Point💡
・num이 1인 경우, num=1이 출력되어, `break에서 switch문에서 빠져나옴.`
・num이 2인 경우, num=2이 출력되지만, `break문이 없기때문에 default도 출력된다.`
・num이 1도, 2도 아닌 경우, default만 출력된다.


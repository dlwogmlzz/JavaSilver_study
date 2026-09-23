package ch8.stringbuilder;

// **substring() 메서드**
// ⇒0 ~ 인수에 넣은 값까지 문자열을 잘라내서 값을 되돌림
// 제1인수 ~ 제2인수까지의 문자를 잘라내서 되돌림
// ⚠️Point⚠️
// 문자열의 문자와 문자사이에 슬래쉬(/)를 넣은 이미지

public class substringTest {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("よろしくお願いします");
        System.out.println("substring : 「" + word.substring(4) + "」");  // substring : 「お願いします」
        System.out.println("substring : 「" + word.substring(5, 7) + "」");    // substring : 「願い」
        System.out.println("substring : 「" + word.substring(5, 12) + "」");   // StringIndexOutOfBoundsException 예외 발생.
    }
}

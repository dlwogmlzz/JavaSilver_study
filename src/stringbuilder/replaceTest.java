package stringbuilder;

// **replace() 메서드**
// ⇒제1인수부터 제2인수의 범위의 문자를, 제3인수로 지정한 문자로 치환한다.
// ⚠️Point⚠️
// 문자열의 문자와 문자사이에 슬래쉬(/)를 넣은 이미지

public class replaceTest {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("おはよう！ございます。");
        System.out.println("replace : 「" + word.replace(4, 11, "みなさん") + "」");
    }
}

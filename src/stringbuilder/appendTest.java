package stringbuilder;
// **append() 메서드**
// ⇒인수로 넘겨진 문자열을, 대상의 문자열로 추가한다.

public class appendTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("おはよう！ございます。");
        System.out.println("append : 「" + sb.append("") + "」");  // append : 「おはよう！ございます。」
    }
}

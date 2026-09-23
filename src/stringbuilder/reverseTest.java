package stringbuilder;

// **reverse() 메서드**
// ⇒문자열의 순번을 거꾸로 치환함.

public class reverseTest {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("ABC");
        System.out.println("reverse : 「" + word.reverse() + "」");  // reverse : 「CBA」
    }
}

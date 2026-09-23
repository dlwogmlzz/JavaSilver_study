package ch8.stringbuilder;

// **delete() 메서드**
// ⇒제 1인수부터 제 2인수 범위의 문자를 삭제함.

public class deleteTest {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("よろしくお願いします");
        System.out.println("delete : 「" + word.delete(4, 7) + "」");  // 「お願い」가 삭제됨. / delete : 「よろしくします」
    }
}

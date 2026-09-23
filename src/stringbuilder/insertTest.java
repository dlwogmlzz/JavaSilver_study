package stringbuilder;

// insert() 메서드
// ⇒인수로 지정된 문자열을,
// 인수로 지정된 문자열의 앞에 삽입한다.

// ⚠️Point⚠️
// 문자열의 문자와 문자사이에 슬래쉬(/)를 넣은 이미지

public class insertTest {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("あいうえお");
        System.out.println("insert : 「" + word.insert(5, "かきくけこ") +"」");
    }
}

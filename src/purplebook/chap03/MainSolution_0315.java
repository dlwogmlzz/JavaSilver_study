package purplebook.chap03;

public class MainSolution_0315 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        // StringBuilder클래스에서 문자열안의 문자를 삭제하기에는 delete()메서드를 사용한다.
        // delete()메서드는 제1인수에서 지정된 위치에서, 제2인수로 지정된 인덱스의 1개 전까지 문자를 삭제한다.
        // ex) delete(int start, int end)
        sb.delete(0, sb.length());
//        sb.delete(0, sb.size());　// size()는 Collection 인터페이스에 속한 객체들의 요소 개수를 셀때 사용하는 메서드 이다.

    }
}

package purplebook.chap03;

public class MainSolution_0318 {
    public static void main(String[] args) {
        String str = new String("Hello");               // String은 불변객체
        StringBuilder sb = new StringBuilder("Hello");         // StringBuilder는 가변객체
        str.concat(" dear");                                // concat을 하면 객체가 새로 생성된다.(Hello dear), 그래서 재대입을 하지 않으면 원본(Hello)만 출력된다.
        sb.append(" dear");                                    // append를 호출하면 원본 자체가 수정된다.
        System.out.println("str: " + str + ", sb: " + sb);

    }
}

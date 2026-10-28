package purplebook.chap02;

// P.53, 배열의 선언, 영역의 확보, 값의 대입을 한번에 행한다.
public class ex06Main {
    public static void main(String[] args) {
        int[][] array = {
            // {}로 감싸진 한개 한개도 요소
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {100, 200, 300, 400}
        };
        System.out.println("array[0][0]의값 : " + array[0][0]);
        System.out.println("array[0][3]의값 : " + array[0][3]);
    }
}

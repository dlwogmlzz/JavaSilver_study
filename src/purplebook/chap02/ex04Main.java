package purplebook.chap02;

// P.51, 배열과 기본 데이터형의 변수
public class ex04Main {
    public static void main(String[] args) {
        int i ;
        //System.out.println("iの値         " + i);   // 컴파일에러, 값이 초기화가 안되어있음.

        int[] array = new int[1];   // 배열의 선언, 영역의 확보까지 되어있음, 각 요소에 값이 대입안되있음
        System.out.println("array[0]の値 : " + array[0]); // array의 0번째를 출력하고 있지만 에러가 되지않고 실행된다.
        // 배열을 생성하면, 데이터형에 맞춰서 초기화가 행해지는 구조로 되어있기 때문...
        //System.out.println("array[0]の値 : " + array[1]);   // 컴파일에러가 아니라, 실행에러가 발생!! 6번째에서 작성하고 있는 array배열의 사이즈는 요소수가 1이다.
        // 즉, 사용가능한 첨자는 0뿐이다. 이같이 요소외에 접근하면 실행시에 에러가 된다.
    }
}

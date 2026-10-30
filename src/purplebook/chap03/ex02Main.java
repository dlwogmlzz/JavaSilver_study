package purplebook.chap03;
// + 연산자를 사용한 문자열 결합
public class ex02Main {
    public static void main(String[] args) {
        String str = "Hello"; int a = 10, b = 20;
        System.out.println(str + a);
        System.out.println(str + a + b);
        System.out.println(str + (a + b));
        System.out.println(a + b + str);
    }
}

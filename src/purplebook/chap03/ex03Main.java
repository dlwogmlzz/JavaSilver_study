package purplebook.chap03;
// 단항연산자의 사용예
public class ex03Main {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10, d = 10;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);

        a = 10; b = 10; c = 10; d = 10;
        b = ++a;    // 전치
        System.out.println("a = " + a + " b = " + b);
        d = c++;    // 후치
        System.out.println("ckk = " + c + " d = " + d);
    }
}

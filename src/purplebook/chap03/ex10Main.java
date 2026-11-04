package purplebook.chap03;

public class ex10Main {
    public static void main(String[] args) {
        int num = 0;
        int a = 10;
        final int b = 20;
        switch(num) {
            case a:
                System.out.println("case a:의 실행");
            case b:
                System.out.println("case b:의 실행");
            case 30:
                System.out.println("case c:의 실행");
        }

        String s1 = "A";
        final String s2 = "B";
        final String[] s3 = {"C"};
        switch("X") {
            case s1:
                System.out.println("case s1     : 의 실행");
            case s2:
                System.out.println("case s2     : 의 실행");
            case s3[0]:
                System.out.println("case s3[0]  : 의 실행");

        }
    }
}

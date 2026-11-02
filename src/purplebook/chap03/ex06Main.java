package purplebook.chap03;
// String클래스의 메서드를 사용한 예
public class ex06Main {
    public static void main(String[] args) {
        String s = "abcdefa";
        System.out.println("charAt()      : " + s.charAt(2));
        System.out.println("indexOf()     : " + s.indexOf('c'));
        System.out.println("length()      : " + s.length());
        System.out.println("replace()     : " + s.replace('a', 'z'));
        System.out.println("substring()   : " + s.substring(2));
    }
}

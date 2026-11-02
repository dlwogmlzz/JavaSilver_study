package purplebook.chap03;
// StringBuilder에서 문자열을 직접 조작한다.
public class ex07Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ab Cdefge");
        System.out.println("append()      : " + sb1.append("XYZ"));                 // 기존 문자열에 「XYZ」를 추가
        StringBuilder sb2 = new StringBuilder("Ab Cdefge");
        System.out.println("insert()      : " + sb2.insert(2, "ZZ"));     // 인덱스의 2번째(반각공백문자)의 앞에 「ZZ」가 삽입된다.
        StringBuilder sb3 = new StringBuilder("Ab Cdefge");
        System.out.println("delete()      : " + sb3.delete(0,5));                   // 0번째에서 5번째의 하나 전(4번째까지)의 문자열을 삭제한다.
        StringBuilder sb4 = new StringBuilder("Ab Cdefge");
        System.out.println("replace()     : " + sb4.replace(3, sb4.length(), "YYY"));   // 3번째부터 마지막까지의 문자열을 「YYY」로 치환한다.
        StringBuilder sb5 = new StringBuilder("Ab Cdefge");
        System.out.println("substring()   : " + sb5.substring(5));              // 5번째부터 마지막까지의 문자열을 취득한다.

    }
}

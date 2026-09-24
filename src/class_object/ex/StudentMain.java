package class_object.ex;

public class StudentMain {
    public static void main(String[] args) {
        // A학생용의 오브젝트 생성
        Student a = new Student();
        // A용 메서드 호출
        a.setId(100);
        // B학생용의 오브젝트 생성
        Student b = new Student();
        // B용 메서드 호출
        b.setId(200);
        System.out.println("A학생의 ID: " + a.getId());
        System.out.println("B학생의 ID: " + b.getId());

    }
}

package class_object.ex;

public class Student {
    // 필드(데이터 저장소)
    int id;

    // 캡슐화(은닉화)
    // 값을 집어넣는 창구
    // 매개변수(int i) : 메서드를 호출할 때 외부에서 던져주는 값을 받아오는 임시 변수
    void setId(int i) { // 접근제어자가 void를 설정하면 반환값 없음.
        id = i;
    }
    // 값을 꺼내오는 창구
    int getId() {
        return id;
    }
}

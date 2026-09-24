[カプセル化とは (캡슐화란)]
⇒ 데이터와 구현을 은폐하는 것

[カプセル化を利用するメリット (캡슐화를 이용하는 장점)]
⇒ 내부 처리를 몰라도 해당 클래스를 이용할 수 있으므로, 프로그램의 확장이 용이해진다
⇒ 외부에서 데이터로의 직접 접근을 막아 데이터를 보호한다

[Point]
* 일반적으로 인스턴스 변수는 `private 지정`, 메서드는 `public 지정하는 것이 권장`된다
* public 지정 클래스는, `하나의 소스 파일당, 1개밖에 기술할 수 없다`
* 소스 파일명 ＝ `public 지정한 클래스 이름`이어야 한다


[カプセル化の例 (캡슐화 예시)]

[예: 학번과 이름을 정의하고 출력하는 클래스]
Public class Student {
    private int id;
    private String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    Public void inform(){
        System.out.println("学生番号:" + id + " 名前:" + name);
    }
}

[예: 좌측 클래스를 이용하는 클래스]
Public class Sample {
    public static void main(String[] args) {
        //Student 클래스의 인스턴스를 생성한다
        Student s1 = new Student(53, "山田太郎");
        //inform() 메서드 호출
        s1.inform();
    }
}

[Point]
利用する側は、引数を正しく指定すれば、Studentの実装を知らなくてもinformメソッドを利用できる
(이용하는 쪽은 인수를 올바르게 지정하면, Student의 구현을 몰라도 inform 메서드를 이용할 수 있다)
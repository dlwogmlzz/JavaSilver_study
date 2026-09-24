[アクセス修飾子とは (접근 수정자란)]
⇒ クラス、コンストラクタ、メンバ変数、メソッドに対して、アクセスを制限できる修飾子
(클래스, 생성자, 멤버 변수, 메서드에 대해, 접근을 제한할 수 있는 수정자)

[표 구조 및 내용]
🔓 [Public] — 모든 클래스에서 접근 가능
    [클래스] ⭕
    [생성자] ⭕
    [멤버 변수] ⭕
    [메서드] ⭕

🛡️ [Protected] — 동일 패키지 또는 상속받은 서브 클래스에서만 접근 가능
    [클래스] ❌
    [생성자] ⭕
    [멤버 변수] ⭕
    [메서드] ⭕

📦 [Default / 없음] — 동일 패키지에 속한 클래스에서만 접근 가능
    [클래스] ⭕
    [생성자] ⭕
    [멤버 변수] ⭕
    [메서드] ⭕

🔒 [Private] — 클래스 내에서만 접근 가능
    [클래스] ❌
    [생성자] ⭕
    [멤버 변수] ⭕
    [메서드] ⭕


class Student {
    `private` int id; // 접근 불가
    `public` Student(int i){
        id = i;
    }
    public int getId(){
        return id;
    } // 접근 가능
}

Public class Main{
    public static void main (String[] args){
        Student stu = new Student(100);
        // アクセス修飾子がprivateなので、コメントを外すとコンパイルエラーになる
        // (접근 수정자가 `private이므로, 주석을 해제하면 컴파일 에러`가 난다)
        //System.out.println(stu.id);
        // アクセス修飾子がpublicなので、他クラスからアクセス可能
        // (접근 수정자가 `public이므로, 다른 클래스에서 접근 가능`)
        System.out.println(stu.getId());
    }
}

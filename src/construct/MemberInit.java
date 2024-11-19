package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit() { // 생성자 필요
    }

    // 추가
    void initMember(MemberInit member, String name, int age, int grade) {
        // name = name; // 이라고 한 경우 가까운 scope인 매개변수 name으로 치환된다.

        // this : 인스턴스 자신의 참조값.
        // 멤버변수에 접근하기 위해 사용
        // 없어도 동일한 이름의 변수가 없으면 멤버변수에 접근할 수 있음
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

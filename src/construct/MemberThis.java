package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this : 인스턴스 자신의 참조값.
        // 멤버변수에 접근하기 위해 사용
        // 없어도 동일한 이름의 변수가 없으면 멤버변수에 접근할 수 있음
        // 그래도 멤버변수에 접근할 땐 생략하지 않고 this.붙이는 코딩 스타일이 있다.
        // 그러나 최근 ide이 발전하면서 색으로 확인가능해지고 this.가 불필요해짐
        nameField = nameParameter;
    }
}

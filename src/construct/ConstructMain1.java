package construct;

public class ConstructMain1 {
    /*
    생성자 장점
    1. 중복 호출 제거
    2. 제약 = 생성자 호출 필수
        객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다.
        생성자를 사용하면 필수값 입력을 보장할 수 있다.
     */

    public static void main(String[] args) {
        // 인스턴스를 생성하고 즉시 해당 생성자를 호출한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 점수: " + member.grade);
        }
    }
}

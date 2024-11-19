package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 생성자명은 클래스명과 같아야함.
    // 생성자는 반환 타입이 없다.
    // 나머지는 메서드와 같다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 추가
    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        // 생성자 내부에서 생성자를 부르는 this() 의 경우 가장 상위에 쓰지 않으면
        // call to this must be first statement in constructor 오류가 발생한다.
        // 이유 : 생성자를 호출하기 이전에 어떤 값을 바꾸는 것은 의미없는 것이기 때문에 막아두는 것
        this(name, age, 50);



    }
}

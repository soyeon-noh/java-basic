package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 타입 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 타입 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 타입 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        // ** 부모타입은 자식타입을 담을 수 있다. **
        Parent poly = new Child();
        poly.parentMethod();
        // 자식타입은 부모타입을 담을 수 없다.
//        Child child1 = new Parent();

        // 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // Why. 상속 관계는 부모 방향으로 찾아 올라갈 수 있지만 자식 방향으로 갈 수 없다.
        // 그래도 자식 메서드를 호출하고 싶다면 *캐스팅*을 사용해야 한다.
//        poly.childMethod();



    }
}

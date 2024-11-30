package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println("===============");

        //부모 변수가 부모 인스턴스를 참조
        Parent parent  = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        System.out.println("===============");

        //부모 변수가 자식 인스턴스를 참조 (다형성 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드 오버라이딩 !!

        // **오버라이딩 . 메서드는 항상 우선권을 가진다 **
        // 오버라이딩은 부모 타입에서 정의한 기능을 자식 타입에서 재정의하는 것
        // 손자가 있다면 손자가 우선권
    }
}

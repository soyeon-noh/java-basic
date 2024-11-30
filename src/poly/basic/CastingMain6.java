package poly.basic;

// Java16 - Pattern Matching for instanceof
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // Child 인스턴스인 경우 childMethod() 실행
        // Java16부터 instanceof 변수 선언 가능
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent; // 생략 가능
            child.childMethod();
        }
    }
}

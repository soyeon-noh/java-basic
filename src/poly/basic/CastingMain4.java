package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        // 다운캐스팅 가능 예시
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제없음

        // 다운캐스팅 불가능 예시
        // - 사용할 수 없는 타입으로 다운캐스팅
        Parent parent2 = new Parent(); // Child인스턴스는 생성되지 X
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가


    }
}

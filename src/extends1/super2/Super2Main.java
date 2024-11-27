package extends1.super2;

public class Super2Main {

    // 상속 관계의 생성자 호출은 부모 -> 자식 순으로 실행됨.
    // 부모의 데이터를 먼저 초기화하고 . 다음에 자식의 데이터를 초기화.
    // 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super(...)를 호출해야한다.
    // 단, 기본 생성자 super()인 경우 생략 가능
    public static void main(String[] args) {
        System.out.println("==== 상속관계에서 생성자 호출 순서 확인 ====");
        ClassC classC = new ClassC();
        System.out.println("==== this 사용 ====");
        ClassB classB = new ClassB(100);
    }
}

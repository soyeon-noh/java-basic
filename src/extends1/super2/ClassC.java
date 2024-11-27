package extends1.super2;

public class ClassC extends ClassB{

    // 부모 ClassB 에는 기본 생성자가 없음.
    // 기본 생성자를 호출하는 super()를 사용하거나 생략할 수 없음
    public ClassC() {
//        super(); // 기본생성자가 존재하지 않음
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}

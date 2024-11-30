package poly.overriding;

public class Parent {
    // 멤버 변수는 오버라이딩 되지 않는다.
    public String value = "parent";

    // 메서드는 오버라이딩 된다.
    public void method() {
        System.out.println("Parent.method");
    }

}

package poly.ex5;

// implements : 구현. interface를 상속받을땐 이렇게 쓴다
public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}

package poly.ex3;

// 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야한다.
// - 추상 메서드를 가진 클래스가 생성되는 걸 방지하기 위함.
public abstract class AbstractAnimal {

    // 자식이 오버라이딩 하기 위해 만든 추상 메서드
    // 추상 메서드는 바디 부분이 없다.
    public abstract void sound();


    // 상속받아 사용하는 목적의 메서드
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

package extends1.super2;

public class ClassB extends ClassA{

    // 상속을 받으면 생성자의 첫줄에 super(...)를 사용해서 부모 클래스의 생성자를 호출해야 한다.
    public ClassB(int a) {
//        super(); //매개변수가 없는 기본 생성자는 생략 가능 (자동으로 생성된다)
        this(a, 0); // ** 첫줄에 super 대신 this를 써서 다른 생성자로 넘어가도 되는데 한번은 super를 호출해야함 **
        System.out.println("ClassB 생성자 a = " + a);
    }

    public  ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}

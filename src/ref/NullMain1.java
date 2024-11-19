package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);

        // GC (garbage collection)
        // 아무도 참조하지 않는 인스턴스는 JVM이 GC를 사용하여 자동으로 메모리에서 제거해준다.

        // 객체는 해당 객체를 참조하는 곳이 있으면 JVM이 종료할 때 까지 계속 생존한다.
    }
}

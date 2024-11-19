package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    // 정적 메서드
    public static void staticCall() {
        // 어떤 인스턴스가 언제 생겼는지 클래스 영역에선 알 수가 없음.
        // 접근 불가
//        instanceValue++; // 인스턴스 변수 접근 X, compile error
//        instanceMethod(); // 인스턴스 메서드 접근 X, compile error

        // + 하지만!!! 인스턴스를 여기서 생성하면 static 변수든 뭐든 사용가능!!
//        DecoData data = new DecoData();
//        data.instanceValue++;

        staticValue++; // 정적 변수 접근 O
        staticMethod(); // 정적 메서드 접근 O
    }

    // 넘겨준건 참조가능
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    // 인스턴스 메서드
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 O
        instanceMethod(); // 인스턴스 메서드 접근 O

//        DecoData.staticValue++; // 원래 이렇게 쓰는건데 생략된거임?
//        DecoData.staticMethod(); //

        staticValue++; // 정적 변수 접근 O
        staticMethod(); // 정적 메서드 접근 O
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}

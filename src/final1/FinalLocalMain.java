package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번번 할당 가능
//        data1 = 20; // 컴파일 오류 already have been assigned


        //final 지역 변수2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류 already have been assigned

        method(10);
    }

    // 매개변수에 final
    static void method(final int parameter) {
//        parameter = 20; // 컴파일 오류
    }
}

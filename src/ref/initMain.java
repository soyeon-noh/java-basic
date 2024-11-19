package ref;

public class initMain {

    // 기본형 변수 : 수동 초기화 해야함
    // 참조형 변수 : 0, false, null 등으로 자동 초기화됨
    public static void main(String[] args) {
        initData data = new initData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}

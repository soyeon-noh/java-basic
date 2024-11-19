package ref;

public class NullMain2 {

    // 참조할 주소가 존재하지 않아서 발생하는 오류
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerExcetption 발생
        System.out.println("data = " + data.value);

    }
}

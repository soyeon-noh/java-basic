package final1;

// final 멤버변수를 생성자를 통해 초기화
public class ConstructInit {

    // final 을 필드에 사용하는 경우
    // 생성자를 통해서만 초기화 가능
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}

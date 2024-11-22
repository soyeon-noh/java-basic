package final1;

// final 멤버변수를 필드에서 초기화
public class FieldInit {

    // static + final 이 붙으면 대문자로 쓰는 관습
    static final int CONST_VALUE = 10;
    final int value = 10;


    // 이미 초기화 되어 있기 때문에 생성자를 통해 값 할당 X
//    public FieldInit(int value) {
//        this.value = value;
//    }
}

package static2;

public class DecoUtil2 {

    // static method 로 변경
    // 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능
    public static String deco(String str) {
        return "*" + str + "*";
    }
}

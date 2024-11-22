package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        // 인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수) 등을 사용하는 목적이 큰데
        // 이 메서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}

package static1;

public class Data3 {
    public String name;
    // static 변수.
    // 멤버 변수에 static 을 붙이면 정적 변수, 클래스 변수라고 한다.
    public static int count;

    public Data3(String name) {
        this.name = name;
//        Data3.count++; // 이것과 같은 것임. 생략가능
        count++;
    }
}

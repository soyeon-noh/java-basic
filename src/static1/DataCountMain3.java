package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // 클래스에 직접 접근 Data3.count
        // static이 붙은 멤버변수는 힙 영역이 아니라 메서드 영역에서 관리한다.
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("A count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count=" + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }


}

package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        // 사용자와 같은 위치 : 경로 생략 가능
        Data data = new Data();
        // 사용자와 다른 위치 : 경로를 포함해서 클래스를 적기
        pack.a.User user = new pack.a.User();
    }
}



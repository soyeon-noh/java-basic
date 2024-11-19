package pack;

// import 를 사용하여 다른 패키지의 클래스를 가져옴
import pack.a.User;
import pack.a.User2;

// * 을 사용해 한 패키지 내부의 모든 클래스를 import할 수 도 있다.
//import pack.a.*

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지 명 생략 가능
        User2 user2 = new User2();
    }
}



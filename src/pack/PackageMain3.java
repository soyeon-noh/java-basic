package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        // 이름이 겹쳤을 때 한 클래스는 경로를 다 적어줘야한다.
        // 보통 자주쓰는 클래스를 import를 하고 나머지를 패키지를 포함한 전체 경로를 적는 편.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}



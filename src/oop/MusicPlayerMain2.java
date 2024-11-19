package oop;

public class MusicPlayerMain2 {

    // 클래스를 사용하도록 로직 변경

    // 음악 플레이어 관련 변수를 MusicPlayerData dat 객체에 속해있음을 쉽게 알 수 있다.
    // 변리하게 관리 가능.
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        // 볼름 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}

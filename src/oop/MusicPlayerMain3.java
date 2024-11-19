package oop;


public class MusicPlayerMain3 {

    // 각 기능을 메서드로 만들어 모듈화.

    // 중복 제거 : 로직 중복 제거
    // 변경 영향 범위 : 수정시 메서드 내부만 변경하면 됨
    // 메서드 이름 추가 : 코드를 더 쉽게 이해
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 UP
        volumeUp(data);
        volumeUp(data);

        // 볼륨 DOWN
        volumeDown(data);

        // 상태 확인
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData data) {
        // 볼름 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        // 볼름 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

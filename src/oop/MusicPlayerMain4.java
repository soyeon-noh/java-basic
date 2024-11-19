package oop;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 음악 플레이어 켜기
        player.on();
        // 볼륨 UP
        player.volumeUp();
        // 볼륨 UP
        player.volumeUp();
        // 볼륨 DOWN
        player.volumeDown();
        // 상태 확인
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}

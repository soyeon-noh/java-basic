package access;

// 클래스 레벨, 필드, 생성자, 메서드 수준에서만 접근 제어자를 사용할 수 있다.
// not 지역변수
public class Speaker {
    private int volume;

    public Speaker(int volume){
        // 생성할 때 초기 볼륨값 받기
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 증가할 수 없습니다. 음량이 10 증가합니다.");
        }
    }

    public void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    public void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}

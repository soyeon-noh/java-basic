package poly.ex.pay1;

// 변하는 부분
// 객체 생성을 막기위해 추상클래스로 선언
public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            // 결제 수단을 찾지 못했을 때
            // null 대신에 항상 실패하는 결제 수단을 사용
            return new DefaultPay();
        }
    }
}

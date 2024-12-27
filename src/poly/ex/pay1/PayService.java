package poly.ex.pay1;

// 변하지 않는 부분
// Pay만 의존하면서 OPP 성립
public class PayService {

    public void processPay(String option, int amount) {

        boolean result  = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제수단 찾기
        Pay pay = PayStore.findPay(option); // 어떤 페이인지 모름. 역할에만 의존하고 있음
        // 실제 결제를 하는 부분
        result = pay.pay(amount);


        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    // PayStotrer 로 매서드 추출
//    public Pay findPay(String option) {
//        // 결제 수단 선택
//        if (option.equals("kakao")) {
//            return new KakaoPay();
//        } else if (option.equals("naver")) {
//            return new NaverPay();
//        } else {
//            System.out.println("결제 수단이 없습니다.");
//            return null;
//        }
//    }
}

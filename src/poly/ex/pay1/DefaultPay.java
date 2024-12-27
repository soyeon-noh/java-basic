package poly.ex.pay1;

// null 대용으로 쓰기때문에 null object pattern이라고 함
public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}

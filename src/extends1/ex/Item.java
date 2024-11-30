package extends1.ex;

public class Item {
    // 멤버변수는 private로 보호해주자
    private String name;
    private int price;

    // 부모 클래스에 생성자로 초기화를 해놓으면 편하다.
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }


}

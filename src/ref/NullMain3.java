package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
//        bigData.data = new Data(); // 이렇게 참조할 곳을 주면 제대로 작동한다.
        System.out.println("bigdata.count= " + bigData.count);
        System.out.println("bigdata.data= " + bigData.data);

        // NullPointerException
        System.out.println("bigdata.data.value= " + bigData.data.value);
    }
}

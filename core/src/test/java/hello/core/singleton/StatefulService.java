package hello.core.singleton;

public class StatefulService {
    private int price;//상태를 유지하는 필드 10000->20000

    //주문에서 주문 이름과 가격을 price에 저장하고 싶다.
    public void order(String name, int price) {
        System.out.println("name = " + name+" price = "+ price);
        this.price = price; //여기가 문제
    }

    public int getPrice() {
        return price;
    }
}

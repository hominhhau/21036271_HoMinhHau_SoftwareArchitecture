package StatePattern;

public class InDelivery implements OrderState {
    @Override
    public void sendRequest() {
        System.out.println("Hàng đang được giao.");

    }

    @Override
    public void checkStatus() {
        System.out.println("Trạng thái: Đang giao.");
    }
}

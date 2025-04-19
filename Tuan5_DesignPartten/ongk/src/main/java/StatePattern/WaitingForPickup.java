package StatePattern;

public class WaitingForPickup implements OrderState {
    @Override
    public void sendRequest() {
        System.out.println("Đơn hàng đang chờ người giao hàng lấy.");
    }

    @Override
    public void checkStatus() {
        System.out.println("Trạng thái: Chờ lấy hàng.");
    }
}


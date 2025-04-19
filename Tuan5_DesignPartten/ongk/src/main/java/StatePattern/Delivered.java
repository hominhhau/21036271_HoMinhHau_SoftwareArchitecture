package StatePattern;

public class Delivered implements OrderState {
    @Override
    public void sendRequest() {
        System.out.println("Đơn hàng đã được giao thành công.");
    }

    @Override
    public void checkStatus() {
        System.out.println("Trạng thái: Đã giao.");
    }
}

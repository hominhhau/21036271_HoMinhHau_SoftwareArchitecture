package StatePattern;

public class WaitingForConfirmation implements OrderState {

    @Override
    public void sendRequest() {
        System.out.println("Đơn hàng đang chờ xác nhận.");
    }

    @Override
    public void checkStatus() {
        System.out.println("Trạng thái: Chờ xác nhận.");
    }
}

package StatePattern;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new WaitingForConfirmation(); // Trạng thái ban đầu
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void sendRequest() {
       this.state.sendRequest();
    }

    public void checkStatus() {
        state.checkStatus();
    }
}

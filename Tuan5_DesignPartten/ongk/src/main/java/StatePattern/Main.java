package StatePattern;

public class Main {
    public static void main(String[] args) {

                OrderContext order = new OrderContext();

                OrderState waitingForConfirmation = new WaitingForConfirmation();
                OrderState inDelivery = new InDelivery();
                OrderState delivered = new Delivered();

                order.sendRequest();
                order.checkStatus();
                System.out.println("====================================");
                order.setState(inDelivery);
                order.sendRequest();
                order.checkStatus();
//                System.out.println("====================================");
//                order.setState(delivered);
//                order.sendRequest();
//                order.checkStatus();
//                System.out.println("====================================");
//                order.setState(waitingForConfirmation);
//                order.sendRequest();
//                order.checkStatus();
            }



}

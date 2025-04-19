package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Thêm các mặt hàng vào giỏ hàng
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // Thanh toán bằng Paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        // Thanh toán bằng thẻ tín dụng
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/25"));
    }
}

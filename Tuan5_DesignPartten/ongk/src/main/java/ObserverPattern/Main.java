package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng NotificationService
        NotificationService notificationService = new NotificationService();

        // Tạo người dùng (Observers)
        User user1 = new User("Người dùng A");
        User user2 = new User("Người dùng B");
        User user3 = new User("Người dùng C");

        // Đăng ký người dùng vào dịch vụ thông báo
        notificationService.registerObserver(user1);
        notificationService.registerObserver(user2);

        // Gửi thông báo lần 1
        notificationService.postNotification("Chào mừng đến với hệ thống!");

        // Đăng ký thêm một người dùng và gửi thông báo lần 2
        notificationService.registerObserver(user3);
        notificationService.postNotification("Cập nhật mới: Thêm tính năng!");

        // Xóa một người dùng và gửi thông báo lần 3
        notificationService.removeObserver(user2);
        notificationService.postNotification("Thông báo: Bảo trì hệ thống vào tối nay.");
    }
}

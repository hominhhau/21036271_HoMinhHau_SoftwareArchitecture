package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Ứng dụng đã khởi động");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Đây là một log khác");

        System.out.println("Logger giống nhau? " + (logger == anotherLogger)); // true
    }
}

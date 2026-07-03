public class NotificationBoxObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("[NOTIFICATION] " + event);
    }
}
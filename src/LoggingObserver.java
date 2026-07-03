public class LoggingObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("[LOG] " + event);
    }
}
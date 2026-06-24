public class LoggingObserver implements SpelEventObserver {

    @Override
    public void update(String event) {
        System.out.println("[LOG] " + event);
    }
}
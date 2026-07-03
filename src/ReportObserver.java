public class ReportObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("[REPORT] " + event);
    }
}
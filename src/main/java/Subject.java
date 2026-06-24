public interface Subject {

    void addObserver(SpelEventObserver observer);

    void removeObserver(SpelEventObserver observer);

    void notifyObservers(String event);
}
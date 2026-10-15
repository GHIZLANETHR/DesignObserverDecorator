package obs;

public interface Observable {
    void subscrie(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}

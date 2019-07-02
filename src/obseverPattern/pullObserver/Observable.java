package obseverPattern.pullObserver;

public interface Observable {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObserver(Observer o);
}

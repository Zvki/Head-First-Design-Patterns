package bartosz.sosnica.observer.Interfaces;

public interface Entity {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}

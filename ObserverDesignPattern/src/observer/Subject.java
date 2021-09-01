package observer;

public interface Subject extends Observer{
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(Book book);
}

package pro.edu.observer;/*
  @author   george
  @project   exercises
  @class  Observed
  @version  1.0.0 
  @since 16.07.21 - 21.30
*/

public interface Observed {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}

package pro.edu.observer;/*
  @author   george
  @project   exercises
  @class  JobSite
  @version  1.0.0 
  @since 16.07.21 - 21.39
*/

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        vacancies.remove(vacancy);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.handleEvents(vacancies);
        }
    }
}

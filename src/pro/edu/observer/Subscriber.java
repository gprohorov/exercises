package pro.edu.observer;/*
  @author   george
  @project   exercises
  @class  Subscriber
  @version  1.0.0 
  @since 16.07.21 - 21.35
*/

import java.util.List;

public class Subscriber implements Observer{
    private String name;
    private String keyWord;

    public Subscriber(String name, String keyWord) {
        this.name = name;
        this.keyWord = keyWord;
    }


    @Override
    public void handleEvents(List<String> vacancies) {

        for ( String vacancy:vacancies){
            if (vacancy.contains(keyWord)){
                System.out.println("I am am " +  name + ". Thank you for a vacantion " + vacancy);
            }
        }
         }

    @Override
    public void subscribe(Observed observed) {
      observed.addObserver(this);
    }
}

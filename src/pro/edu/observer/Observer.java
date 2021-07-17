package pro.edu.observer;/*
  @author   george
  @project   exercises
  @class  Observer
  @version  1.0.0 
  @since 16.07.21 - 21.27
*/

import java.util.List;

public interface Observer {
    void handleEvents(List<String> vacancies);
    void subscribe(Observed observed);
}

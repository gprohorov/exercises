package pro.edu.observer;/*
  @author   george
  @project   exercises
  @class  JobSearch
  @version  1.0.0 
  @since 16.07.21 - 21.50
*/

public class JobSearch {
    public static void main(String[] args) {
        JobSite site = new JobSite();
        site.addVacancy("C++ junior developer");
        site.addVacancy(" engineer");

        Subscriber javaDevelopr = new Subscriber("Java Dev", "Java");
        Subscriber tester = new Subscriber("QA Engineer", "QA");
        Subscriber web_designer = new Subscriber("WEB design", "HTML");


        site.addObserver(javaDevelopr);
        site.addObserver(tester);
        web_designer.subscribe(site);


        site.addVacancy("Designer");
        site.addVacancy("Java back-end developer ");
        site.addVacancy("  HTML, CSS, JS  development ");

    }
}

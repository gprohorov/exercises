package pro.edu.mlthrd.threethrds;/*
  @author   george
  @project   exercises
  @class  ThrdMain
  @version  1.0.0 
  @since 20.06.21 - 19.12
*/

public class ThrdMain {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Runnable printFirst = new Runnable() {
            @Override
            public void run() { System.out.print("first");  }
        };
        Runnable printSecond = new Runnable() {
            @Override
            public void run() { System.out.print("second");  }
        };
        Runnable printThird = new Runnable() {
            @Override
            public void run() { System.out.print("third");  }
        };
        int[] array = {3,1,2};

        for (int i = 1; i <= 3; i++) {
            switch (i){
                case 1: foo.first(printFirst); break;
                case 2: foo.second(printSecond); break;
                case 3: foo.third(printThird); break;
            }
        }
    }
 }




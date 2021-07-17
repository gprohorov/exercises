package pro.edu.mlthrd.threethrds;/*
  @author   george
  @project   exercises
  @class  Way1
  @version  1.0.0 
  @since 20.06.21 - 17.44
*/

//  A task from leetcode   https://leetcode.com/problems/print-in-order/


class Foo2 {
 public  volatile int threadTurn;
    public Foo2() {
    threadTurn = 1;
    }

    synchronized public void first(Runnable printFirst) throws InterruptedException {
        while(threadTurn != 1){
            wait();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        threadTurn++;
        notifyAll();
    }

    synchronized public void second(Runnable printSecond) throws InterruptedException {
        while(threadTurn != 2){
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        threadTurn++;
        notifyAll();
    }

    synchronized public void third(Runnable printThird) throws InterruptedException {
        while(threadTurn != 3){
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}


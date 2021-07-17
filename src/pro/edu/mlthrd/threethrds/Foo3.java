package pro.edu.mlthrd.threethrds;/*
  @author   george
  @project   exercises
  @class  Way1
  @version  1.0.0 
  @since 20.06.21 - 17.44
*/

//  A task from leetcode   https://leetcode.com/problems/print-in-order/


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo3 {
 public  volatile int threadTurn;
 private Lock lock = new ReentrantLock();
 private Condition condition = lock.newCondition();
    public Foo3() {
    this.threadTurn =1;
    }

     public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            this.threadTurn++;
            condition.signalAll();
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        }finally {
            lock.unlock();
        }

    }

     public void second(Runnable printSecond) throws InterruptedException {

            lock.lock();
        try {
            while (this.threadTurn != 2){
                condition.await();
            }
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                threadTurn++;
                condition.signalAll();
            }finally {
            lock.unlock();
            }
    }

     public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (threadTurn != 3) {
                condition.await();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            this.threadTurn++;
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}


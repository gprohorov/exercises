package pro.edu;

public class Automobile {
 //  class  Atm{abstract void hank();}   //  compile NOT
 abstract class  Atm{abstract void hank();}
 // abstract class  Atm2{ void hank();}    // NOT
 abstract class  Atm2{ void hank(){};}
 abstract class  Atm3{ abstract void hank();}

    class A {
     protected int i;
     A(int i){
         this.i = 1;
     }
    }
   // class B{}
  //  class B extends A{} // NO default constructor in A
    //class B extends A{B(){System.out.println(i);}} // The same
    class B{B(){}}

    public interface IConstants{
     int a =1;
     public int b = 1;
     static  int c = 1;
     final  int d = 1;
     public static int e =1;
     public final  int f = 1;
     static final int g = 1;
     public static final int h = 1;
    }
    public static void main(String[] args) {

      int i = 5;
      switch (i){
          default:
          case 1 : System.out.println(1);
          case 0 : System.out.println(0);
          case 2 : System.out.println(2); break;
          case 3 : System.out.println(3);
      }


    }
}

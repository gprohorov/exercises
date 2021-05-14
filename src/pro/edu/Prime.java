package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Prime
  @version  1.0.0 
  @since 05.03.2021 - 14.46
*/

public class Prime {
    public static boolean isPrime(int num){
        if (num == 1) return false;
        for (int i = 2; i < num ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( isPrime(11)); // true
        System.out.println( isPrime(31)); // true
        System.out.println( isPrime(111)); // false
        System.out.println( isPrime(102)); // false

    }
}

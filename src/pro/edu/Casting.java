package pro.edu;

public class Casting {

    public static void main(String[] args) {
        int a = 1;
        int b= 2;

      //    if (a=b){}   compilation error
        if (true);else;     //  conpile

        short s = Short.MAX_VALUE;
        char c = (char) s;
        //System.out.println(c == s);  // true
    }

}

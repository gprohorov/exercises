package pro.edu;

public class Casting {
    public static void main(String[] args) {

        char c = 112;
        long l = c;

        byte b = 100;
        short sh = b;

        c = (char) sh;  // !!!!!!

        int i = 2;
        float fl = i;



    }
}

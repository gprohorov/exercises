package pro.edu.trash;

import java.io.IOException;
import java.util.Arrays;

public class Trash2 {
    interface Doer{
        String doIt(int i, String y);
    }
    static int x =5;

    public void perform() throws IOException{
        throw new NullPointerException();
    }
    class A{}
    class B extends A{}
    class C extends B{}
     class D extends C{}
     A a = new D();

    static String[] sa = {"a", "aa","aaa","aaaa"};
    static {
        Arrays.sort(sa);
    }
    public static void main(String[] args) {
        int x = (x=3) *4;
        int y = Trash2.x;
        Doer doer = (a, b)->b.substring(0,a);

        System.out.println(doer.doIt(2,"12345"));

        String search = "";
        if(args.length !=0) search= args[0];
        System.out.println(Arrays.binarySearch(sa, search));

        int a = 1;
        int b = 2;

        String s = "blooper";
        StringBuilder sb = new StringBuilder(s);
        sb.append(s.substring(4));
        System.out.println(sb.toString());


    }
}

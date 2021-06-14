package pro.edu;

import java.util.ArrayList;
import java.util.List;

public class Encrypption {
    public static  String encrypt(String text){

        System.out.println(text.length());
        text = text.replaceAll(" ", "");
        int length = text.length();
        int height = (int) Math.sqrt(length);
        int width = 0;
        if (height*height == length) {
            width = height;
        } else{
            width = height + 1;
            if (width*height < length) height += 1;
        }

        System.out.println( length + " = " + height + " * " + width);
        int delta =  width*height - length;
        System.out.println(delta);
        for (int i = 0; i < delta ; i++) {
            text= text + " ";
        }
        System.out.println( text.length() + " = " + height + " * " + width);

          String[] array = new String[height];

        for (int i = 0; i < height ; i++) {
            array[i] = text.substring(i*width, (i+1)* width);
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        List<String> list = new ArrayList<>();

        for (int i = 0; i < width ; i++) {
            String str = "";
            for (int j = 0; j < height ; j++) {
               str+= array[j].charAt(i);
            }
           str = str.trim();
            list.add(str);
        }
        System.out.println(list);
        String out = "";
        for (int i = 0; i < list.size() ; i++) {
            out+=list.get(i) + " ";
        }

        return out;
    }

    public static void main(String[] args) {
        String text = "012345 6789abcdefg hijklm nopqrst uvwxyz ADCD";
        System.out.println(encrypt(text));
        text = "haveaniceday";
        System.out.println(encrypt(text));
        text = "feed the dog";
        System.out.println(encrypt(text));

        text = "chillout";
        System.out.println(encrypt(text));

        text = " A Fool and His Money  Are Soon Parted ";
        System.out.println(encrypt(text));
    }
}

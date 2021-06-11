package pro.edu;

import java.util.Locale;

public class ConvertBinary {
    public static String convert(String str){
        String out = "";
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'm') {
                out += "0";
            }else {
                out+= "1";
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(convert("house"));
    }

}

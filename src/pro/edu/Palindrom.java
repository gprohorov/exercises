package pro.edu;
/*
  @author   george
  @project   exercises
  @class  palindrom
  @version  1.0.0 
  @since 05.05.2011 - 13.01
*/

public class Palindrom {
    // The first method. Comparison of all symbols
    public static boolean isPalindrom1(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я]","");// remove garbage by regex
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    // The second method. Comparison of two strings
    public static boolean isPalindrom2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]","");// remove garbage by regex
        String reversed = "";
        for (int i = text.length()-1; i >=0 ; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }
    // The third method. StringBuilder
    public static boolean isPalindrom3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]","");// remove garbage by regex
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
    // The third method. StringBuilder
    public static boolean isPalindromNum(int num) {
        if (num <0) return false;
        if (num % 10 ==0) return false;
        int reversed =0;
        int buffer = num;
        while(buffer !=0){
            reversed *=10;
            reversed += buffer % 10;
            buffer = buffer /10;
        }
        return num == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom1("abcdcb- a")); // true
        System.out.println(isPalindrom1("abcdcb aa")); // false
        System.out.println("-----------");
        System.out.println(isPalindrom2("abcdcb- a")); // true
        System.out.println(isPalindrom2("abcdcb aa")); // false
        System.out.println("-----------");
        System.out.println(isPalindrom3("abcdcb- a")); // true
        System.out.println(isPalindrom3("abcdcb aa")); // false
        System.out.println("-----------");
        System.out.println(isPalindromNum(12321)); // true
        System.out.println(isPalindromNum(12333)); // false
    }
}

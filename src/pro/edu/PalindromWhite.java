package pro.edu;

public class PalindromWhite {

    public static boolean isPalWhite(String str){

        int length = str.length();

        int cursorStart=0;
        int cursorEnd=length -1;
        for (int i = 0; i < length; i++) {
            System.out.println(i);
            char fromStart = str.charAt(cursorStart);
            char fromEnd = str.charAt(cursorEnd);

            if (fromStart == ' '){
                cursorStart++;
                continue;
            }

            if (fromEnd == ' '){
                cursorEnd--;
                continue;
            }
            if (fromStart != fromEnd) return false;

            cursorStart++;
            cursorEnd--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "a bcdedcba";
        System.out.println(isPalWhite(str));


    }
}

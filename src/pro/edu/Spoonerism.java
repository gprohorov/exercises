package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Spoonerism
  @version  1.0.0 
  @since 02.04.2021 - 08.07
*/

public class Spoonerism {
    public static String spoonerism(String phrase){
        String vovels = "aeiouy";
        String[] array = phrase.split(" ");
        String theFirstWord = array[0];
        String theSecondWord = array[1];
        char theFirstWordLetter = theFirstWord.charAt(0);
        String theFirstWordRest = theFirstWord.substring(1, theFirstWord.length() );
        char theSecondWordLetter = theSecondWord.charAt(0);
        String theSecondWordRest = theSecondWord.substring(1, theSecondWord.length());
        //-----------------------------------------------------------------------------
        String result = theSecondWordLetter + theFirstWordRest + " " +  theFirstWordLetter + theSecondWordRest;

        if ( vovels.contains(String.valueOf(theFirstWord.charAt(0)))){

            result = theSecondWordLetter + theFirstWord + " "+ theSecondWordRest;
        }

        if ( theFirstWordLetter == 'c' && theFirstWord.charAt(1) == 'h') {
            result = theSecondWordLetter + theFirstWord.substring(2, theFirstWord.length())
                    + " " + "ch" + theSecondWordRest;

        }

        return  result;
    }

    public static void main(String[] args) {
        System.out.println(spoonerism("historic lecture"));
        System.out.println(spoonerism("loud noises"));
        System.out.println(spoonerism("angry birds"));
        System.out.println(spoonerism("chow main"));

    }


}

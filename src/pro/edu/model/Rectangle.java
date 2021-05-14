package pro.edu.model;
/*
  @author   george
  @project   exercises
  @class  Rectangle
  @version  1.0.0 
  @since 12.05.2021 - 18.14
*/

public class Rectangle {
    private int length;
    private int width;

    public int getArea(){
        return length * width;
    }
    public static int getArea(int a, int b){
        return 0;
    }
}

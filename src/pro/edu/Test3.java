package pro.edu;

public class Test3 {
    static int a = 0;
    int b = 5;
    void foo(){
        while(b>0){
            b--;
            a++;
        }
    }

    public static void main(String[] args) {
        Test3 p1 = new Test3();
        p1.foo();
        Test3 p2 = new Test3();
        p2.foo();
        System.out.println(p1.a + " " + p2.a);
    }

}

package pro.edu;
interface X1{}
interface X2{}
class A{}
class B extends A implements X1{}
class C extends B implements X2{
    D d = new D();
}
class D{}
public class oop {
    public static void main(String[] args) {

        A c = new C();
        X1 c2 = new C();
        X2 c3 = new C();
    }
}

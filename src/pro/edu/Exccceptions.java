package pro.edu;

public class Exccceptions {

    class XXX{
        public void m() throws Exception{
            throw new Exception();
        }
    }

    class YYY extends XXX{
        public void m(){}

        public  void main(String[] args) {
            YYY obj = new YYY();
            obj.m();
        }
    }

}

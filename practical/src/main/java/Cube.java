//
//public class Cube {
//    protected double
//            height,width,depth;
//    Cube(){
//        System.out.println("inside default Constructor:CUBE");
//              
//    }
//    
//}

class A
{
    A(int x)
    {
        System.out.println("in class A");
          
    }
}

class B extends A
{
    B(){
        super(6);
        System.out.println("in class B");
    }
}
class Cube
{
    public static void main(String[] args) {
        B obj=new B();
    }
}

interface Shapes{

    double pi=3.14;
    double getSquare(double r);

}
class Square implements Shapes{
    public double getSquare(double  r){
        return r*r;
    }
}
interface M{
    void fun();
}
interface N{
    int x=20;
    void fun();
}
class imple implements  M,N{
  public   void fun(){
        System.out.println(" i am fucntion in imple");
    }
}
interface O extends M,N{
    void fun();
    default void hi(){
        System.out.println("hello");
    }
}


public class InterfaceExample implements O{
public void fun(){
    System.out.println("i am in interface O");
}


    public static void main(String[] args) {
Square a1=new Square();
        System.out.println("area of square is : "+a1.getSquare(4));
        imple a2=new imple();
        a2.fun();
        InterfaceExample a3=new InterfaceExample();
        a3.fun();
        a3.hi();
    }
}

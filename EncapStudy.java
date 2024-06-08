package Encapsulation;
class A{
    private int a=10;
    private int b=10;
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public void setA(int a){
        this.a=a;
    }

}
public class EncapStudy {

    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.getA()+" "+a1.getB());
        a1.setA(23);
        System.out.println(a1.getA());
    }
}

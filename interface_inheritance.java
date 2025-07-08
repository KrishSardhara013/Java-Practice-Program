//Write a program that illustrates interface inheritance. Interface P is extended by P1 and P2. Interface P12 inherits from both P1 and P2.Each interface declares one constant and one method. class Q implements P12.Instantiate Q and invoke each of its methods. Each method displays one of the constants.

interface P {
    int n=10;
    void methodP();
}
interface P1 extends P{
    int n1=20;
    void methodP1();
}
interface P2 extends P{
    int n2=30;
    void methodP2();
}
interface P12 extends P1,P2{
    int n3=40;
    void methodP12();
}
class Q implements P12{
    @Override
    public void methodP(){
        System.out.println("Method in P, Constant: " +n);
    }
    @Override
    public void methodP1() {
        System.out.println("Method in P1, Constant: " + n1);
    }
    @Override
    public void methodP2() {
        System.out.println("Method in P2, Constant: " + n2);
    }
    @Override
    public void methodP12() {
        System.out.println("Method in P12, Constant: " +n3);
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.methodP();
        obj.methodP1();
        obj.methodP2();
        obj.methodP12();  
 }  }

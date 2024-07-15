Package abstraction;
interface A{
  int x=10;
  void fun();
}
interface B{
  int x=20;
  void fun();
}
void c implements M, N{//Multiple inheritance in java
  public void fun(){
    System.out.println("Hello, I'm function in C");
    System.out.println(M.x);//Ambiguity resolved fully qualified Name
    System.out.println(N.x);//Ambiguity resolved fully qualified Name
    System.out.println(M.super.hashCode());
    System.out.println(N.super.hashCode());
    }
}
interface 0 extends M,N{//Multiple inheritence through Interfaces
  void fun();
}
void D implements o{
  public void fun(){
    System.out.println("Hello, I'm function in D");
    }
}
public class MultipleInheritenceStudy{
  public static void main(String[] args){
    C c= new C();
    c.fun();

    D d= new D();
    d.fun();
  }
}

Package primitiveDT;
class demo{
  void fun(){
    System.out.println("I have no parameters");
  }
  void fun(int a){
    System.out.println("I have 1 parameter a: "+a);
  }
  void fun(int a, int b){
    System.out.println("I have 2 Parameter a & b: "+a+", "+b);
}
public class methodoverload{
  public static void main(String[] args){
    demo obj =new demo();
    obj.fun();
    obj.fun(5);
    obj.fun(10,20);
    obj.fun("Hi T here");

    System.out.println(5);
    System.out.println("abc");
    System.out.println(5.06);
  }
}

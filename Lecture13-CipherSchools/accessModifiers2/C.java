package accessModifiers2;
import Accessmodifiers1.A;
public class C extends A{
  public static void main(String[] args){
    A obj =new A();
    C childObj=new C();
    System.out.println(obj.x);
    System.out.println(childObj.x);
    System.out.println(obj.y);
    System.out.println(obj.z);
    System.out.prinln(chikdObj.w);
  }
  
}
  

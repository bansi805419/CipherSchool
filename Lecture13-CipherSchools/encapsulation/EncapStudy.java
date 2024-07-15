package encapsulation;
class Demo{
  private int a=5;
  private int b=10;
  private int c=15;
  private int d=20;
  public int getA(){
    System.out.println("Value of A read");
    return this.a;
  }
  public int getB(){
    System.out.println("value of B read");
    return this.b;
  }
  public void setA(int a){
    if(a>100){
      this.a=a;
      System.out.println("Value of A changed to: "+a);
    }
    else{
      System.out.println("Cannot set - value outside linits");
    }
  }
  public void setB(int b){
    this.b=b;
  }
  public void getC(){//only geter of C -> read only//
    return c;
  }
  public void getD(int d){//setter only ->write only
    this.d=d;
  }
}
public class Encapstudy{
  public static void main(String[] args){
    Demo d= new Demo();
    System.out.println(d.a);
    System.out.prinln(d.getA());
    d.setA(100);
    System.out.println(d.getA());
  } 
}

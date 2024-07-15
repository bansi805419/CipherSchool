package abstraction;
interface Shape{
  double pi=3.14;
  double getsquare(double r);
}
class Circle implements Shape{
  public double getSquare(double r){
    retrun r*r;
  }
  void fun(){
    System.out.println("Hey, I implemented an interface named Shape");
  }
}

public class InterfaceStudy{
  public static void main(String[] args){
    Circle c = new Circle();
    System.out.println(c.getSquare(5));
  }
}

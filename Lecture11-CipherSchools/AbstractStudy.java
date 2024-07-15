Package abstraction;
abstract class Car{
  int maxSpeed;
  abstract void accelerate();
  abstract void brake();
}

abstraction class BMW extends Car{
  void accelerate(){
    System.out.println("BMW is accelereating");
  }
}
class BMW2 extends BMW{
  void brake(){
    System.out.println("BMW is  applying Breaks");
  }
}
abstract class A{
  int x=10;
  void fun(){
    System.out.println("Hello, I'm A");
  }
public class AbstractStudy{
  public static void main(String[] args){
    // Car c= new Car();
    // BMW beemer=new BMW();
    // beemer.accelerate();
    
    BMW2 b= new BMW2();
    b.accelerate();
    b.brake();
  }
}

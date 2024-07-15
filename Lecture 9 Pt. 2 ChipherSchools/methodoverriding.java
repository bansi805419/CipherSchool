
Package PrimitiveDT;
class parent{
  void fun()
  {
    System.out.println("Hi I'm A");
  }
}
class child extends parent{
  void fun(){
    System.out.println("Hi I'm B");
  }
}
public class methodoverriding{
  public static void main(String[] args){
    child c= new child();
    c.fun();
  }
}

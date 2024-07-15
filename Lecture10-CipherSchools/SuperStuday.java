package Keywords;
class loan{
  int rate;
  loan(){
    System.out.println("Hi, I'm default contructor of loan");
  }
  loan(int rate){
    this.rate= rate;
  }
  void printRate(){
    System.out.println(this.rate);
  }
}
class cartoan extends loan{
  int rate;
  carloan(){
    System.out.println("Hi, I'm default contructor of carLoan");
    System.out.println(super.rate);
  }
  carloan(int rate){
    super(7);
    this.rate=rate;
  }
  void printRate(){
    System.out.println(this.rate);
    super.printRate();
    System.out.println(super.rate);
  }
}
public classSuperstuday{
  public static void main(String[] args){
    carloan cl2= new carloan();
    carloan cl=new carloan(8);
    }
}

    
  

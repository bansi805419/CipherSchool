package Lecture25CipherSchools;

public class RecursionStudy{
  
  Static void printDescending(int n)
  {
    if(n<1) return;
    System.out.println(n);
    printDescending(n-1);
  }
  
  public static void main(String[] args){
    int n=5;
    printDescending(n);
  }
  
}

package arrays;
public class PassingArray{
  static void addOne(int x){
    x=x+1;
  }
  static void addOne(int arr[]){
    for(int i=0;i<arr.length;i++){
      arr[i]++;
    }
  }
  public static void main(String[] args){
    int x=10;
    addOne(x);
    System.out.prinln(x);
    int arr[]={1,2,3,4,5};
    addOne(arr);
    for(int i=0;i<arr.length;i++){
      System.out.prinln(arr[i}+" ");
    }
    System.out.prinln();
  }
}

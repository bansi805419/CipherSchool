Package arrays;
public class ArrayStudy{
  Static void print(int arr{}){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] +"");
    }
    System.out.prinln();
  }
  public static void main(String[] args){
    // 1. Array creation Expression
    int size=5;
    int arr[]=new int[size];
    System.out.prinln(arr[0]);
    System.out.println(arr[1]);
    System.out.prinln(arr[2]);
    System.out.prinln(arr[3]);
    System.out.prinln(arr[4]);
    //print(arr);
    for(int i=0;i<size;i++){
      arr[i]=i+1;
    }
    print(arr);
    // 2.Array initialzers list
    int arr2[]={1,2,3};
    print(arr2);

    //if we want to increase size of an array?
    int copyArray[]=new int[2*size];//create an rray of dpuble size
    for(int i=0;i<size;i++)//copy all element from old to new array
      {
        copyArray[i]=arr[i];
      }
        copyArray[5]=6;
        copyArray[6]=7;
        print(copyArray);  
  }
}

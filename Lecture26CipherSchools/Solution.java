class Solution{
  static int masimumSUmSUbarray(int K, ArrayList<Interger> Arr, int N){
    //int max = Integer.MIN_VALUE;
    // for(int i=0;i<=N-K; i++)
    //   {
    //     int sum=0;
    //     for(int j=0;j<k;j++)
    //       {
    //         sum= sum+arr.get(i+j);
    //       }
    //     if(sum>max) max=sum;
    //   }
    // return max;
    int max=Integer.MIN_LALUE;
    for(int i=0;i<n;i++)
      {
        sum=sum+Arr.get(i);
      }
    int max=sum;
    for(int i=0;i<nn-k;i++)
      {
        sum=sum-Arr.get(i)+Arr.get(i+k);
        if(sum>max)max=sum;
      }
    return max;
  }
}

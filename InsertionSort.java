class Solution
{
  
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){//i=1 to i=4
          int temp=arr[i];//temp=1
          int j=i-1;//j=0
          for(;j>=0;j--){// 0 
            if(arr[j]   >   temp){//yes
                arr[j+1]=arr[j];//arr[1]=arr[0]
            }else{
                break;
            }
          }
          arr[j+1]=temp;//arr[1]=1 
      }
  }
}
//Adeptable algorithm :  set of rules that dynamically adjusts its behavior or structure in response to varying data inputs
// stable algorithm
// in-place sort
// Time complexity: Best : O(n) , worst: O(n^2)
//space complexity: O(1)

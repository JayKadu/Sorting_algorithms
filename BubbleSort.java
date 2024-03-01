import java.io.*;
import java.util.*;
class BubbleSort{
  static void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
  public static void bubbleSort(int[] arr, int n){
    for(int i=0;i<n;i++){
      for(int j=1;j<n-i;j++){
        if(arr[j]>arr[j+1])
          swap(arr, j, j+1);
      }
    }
  }
}

class Solution
{
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=1;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
// In place sorting: sorts the input array without any additional memory
// stable sorting: preserve order
//time complexity : worst case: O(n^2) , best case: O(n)
//space complexity: O(1)

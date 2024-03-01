class Solution
{
	
	void swap(int arr[], int a, int b){
	    int temp=arr[a];
	    arr[a]=arr[b];
	    arr[b]=temp;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n;i++){
	        int min_index=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[min_index]){
	                min_index=j;
	            }
	        }
	        swap(arr,min_index,i);
	    }
	}
}
// In place sorting: sorts the input array without any additional memory
// unstable sorting: do not preserve order
//time complexity : worst case: O(n^2) , best case: O(n^2)
//space complexity: O(1)

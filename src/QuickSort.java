
public class QuickSort {
	
	public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
       i=low;
       j=high;
       temp=arr[low];
       while(i<j) {
    	    while(arr[j]>=temp&&j>i) {
    	    	j--;
    	    }
    	    while(arr[i]<=temp&&i<j) {
    	    	i++;
    	    }
    	    if(i<j) {
    	    	t=arr[i];
    	    	arr[i]=arr[j];
    	    	arr[j]=t;
    	    }
       }
       arr[low]=arr[i];
       arr[i]=temp;
       //递归调用左半数组
       quickSort(arr, low, j-1);
       //递归调用右半数组
       quickSort(arr, j+1, high);
       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

	}

}


public class Selection_Sort {
	public void sort(int arr[], int n) {
		n = arr.length;
		int min = Integer.MAX_VALUE;
		int count=0;
		for(int i = count+1; i<n;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
			
		}
		
		count++;
		
		if(arr[count-1]>min) {
			int temp = arr[min];
			arr[min] = arr[0+ count+1];
			arr[0+count+1] = temp;
			
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		
		
		
 
	}

	public static void main(String[] args) {
		int arr[] = {-18,-12,0,6,44,2,10};
		Selection_Sort s1 = new Selection_Sort();
		s1.sort(arr, arr.length);
		
		 

	}

}

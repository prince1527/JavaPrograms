import java.util.*;
public class Leader_In_Array {
	void Leader(int arr[] , int n) {
		int right_maximum = arr[n - 1];
		System.out.println(right_maximum+"");
		for (int i = n-2; i>=0;i--) {
			if(right_maximum<arr[i]) {
				right_maximum = arr[i];	
				System.out.println(right_maximum+"");
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		Leader_In_Array l1 = new Leader_In_Array();
		int arr[] = {10,8,7,9,11,2,0};
		int n = arr.length;
		l1.Leader(arr, n);
		
		
		

	}

}

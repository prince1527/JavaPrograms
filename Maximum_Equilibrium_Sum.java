import java.util.*;
import java.lang.*;
public class Maximum_Equilibrium_Sum {
	static void MaxSum(int arr[] , int n) {
		int[] prefix_sum = new int[n];
		int[] suffix_sum = new int[n];
		int count = 0;
		int Maxx = Integer.MIN_VALUE;
		
		prefix_sum[0] = arr[0];
		suffix_sum[n-1] = arr[n-1];
		
		while(count < arr.length) {
			for (int i=0; i<n ; i++) {
				for(int j=n-1; j>=0; j--)
				if (prefix_sum[i] > suffix_sum[j]) {
					suffix_sum[j]=suffix_sum[j]+arr[j-1];
				}
				
				else if (prefix_sum[i]<suffix_sum[j]) {
					prefix_sum[i]=prefix_sum[i]+arr[i+1];
					
					
				}
				
				else if (prefix_sum[i]==suffix_sum[j]) {
					System.out.print(prefix_sum);
						
					
				}
				
				
				
				
				
			}
			
				
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Maximum_Equilibrium_Sum m1 = new Maximum_Equilibrium_Sum();
		
		int arr[] = {5,1,-5,-1,2,6,-4,2};
		int n = arr.length;
		m1.MaxSum(arr, n);

	}

}

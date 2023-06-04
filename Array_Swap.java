
public class Array_Swap {
	

	public static void main(String[] args) {
		int arr2[] = new int[] {};
		int arr[] = new int[] {1,2,3,4,5};
		int demo = 2;
		for (int i=0; i<=demo;i++){
			 arr2[5-demo] = arr[i];
			
		}
		
		//System.out.print(arr);
		
		for (int element: arr) {
            System.out.println(element);}

	}

}

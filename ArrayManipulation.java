import java.util.*;
public class ArrayManipulation {
	public static void main(String[] args) {
		double[] doubleArray = {8,4,9.3,0.2,7.9,3.4};
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArrayL:");
		
		for(double value : doubleArray)
			System.out.printf("%.1f",value);
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray, "filledIntArray");
		
		int[] intArrat = {1,2,3,4,5,6};
		int[] intArrayCopy = new int[intArray.length];
	}

}

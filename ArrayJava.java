import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class ArrayJava {
	
	public static void main(String args[]) {
		int[] integerArray = {4,2,5,7,4,7,8,2,5,8,4,2,10,40};
		double[] doubleArray = new double[] {1.2,4.3,5.3,6.4,8.6};
		System.out.println("This is the interger Array");
		for (int i = 0; i<integerArray.length;i++) {
			System.out.print(integerArray[i]+"");
		}
		System.out.println("");
		System.out.println("This is the Double Array");
		for (int i = 0; i<doubleArray.length;i++) {
			System.out.print(doubleArray[i]+" ");
		}
		System.out.println("");
		
		Arrays.sort(integerArray);
		System.out.println("Sorted integer Array :"+Arrays.toString(integerArray));
		Arrays.sort(doubleArray);
		System.out.println("Sorted double Array :"+Arrays.toString(doubleArray));
	}

}

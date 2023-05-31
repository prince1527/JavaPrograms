import java.util.Scanner;
public class Euclideon_GCD {
	
	
	
	 public static int gcd(int a, int b)
	    {
	        if(b==0) {
	        	return a;
	        }
	        return gcd(b , a%b);
	    }
	

	public static void main(String[] args) {
		int g;

		g=gcd(28,42);
		System.out.print(g);
		

	}

}

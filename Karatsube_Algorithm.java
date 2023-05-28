
import java.lang.Math;
public class Karatsube_Algorithm {
	 public int Karatsube(int x, int y) {
  		String n =  Integer.toString(x);
  		int m = Integer.parseInt(n);
		int k = (int) Math.ceil(m/2);
		int p = (int) Math.pow(x, k);
		int a = Math.floorDiv(x, p);
		int b = x%p;
		int c = Math.floorDiv(y, p);
		int d = y%p;
		
		int ac = Karatsube(a,c);
		int bd = Karatsube(b,d);
		int z = Karatsube(a+b,c+d);
		int result = (ac*(int)Math.pow(10, 2*(m/2)));
		
		return result;
		
		
	 }

	

	public static void main(String[] args) {
		Karatsube_Algorithm ka1 = new Karatsube_Algorithm();
		
		ka1.Karatsube(1461123,352120);

	}

}

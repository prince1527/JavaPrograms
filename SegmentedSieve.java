
public class SegmentedSieve {
	public static void sSieve(int l , int h) {
		int low=l;
		int high=h;
	    int n = h-l+1;
	    boolean prime[] = new boolean[n+1];
	    for(int i = 0; i<n;i++) {
	    	prime[i]=true;
	    }
	    
	    for (int j = 2; j< Math.floor(n); j++) {
	    	if(prime[j]==true) {
	    		for(int k = j*j; k<=n;k+=j  ) {
	    			prime[k]=false;
	    			
	    		}
	    	}
	    }
	    
	    for(int i = low; i<high-3;i++) {
	    	if(prime[i]=true) {
	    		System.out.print(i+" ");
	    	}
	    }
	    
		
		
		
	}

	public static void main(String[] args) {
		SegmentedSieve  s1 = new SegmentedSieve ();
		s1.sSieve(6, 10);
		

	}

}

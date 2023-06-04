
public class ActivitySelection {
	
	public static void totalActivities(int start[], int end[],int n) {
		int k=0;
		System.out.println(k);
		
		
		for (int i =1; i<n;i++) {
			if (start[i]>end[k]) {
				System.out.println(i);
				k=i;
			}
		}
	}

	public static void main(String[] args) {
		int start[] =  {1, 3, 0, 5, 8, 5};
	    int end[] =  {2, 4, 6, 7, 9, 9};
	    int n = start.length;
	    totalActivities(start,end,n);
		

	}

}

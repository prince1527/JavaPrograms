import java.util.*; 
 
class Block_Swap_Algo{ 
    
    
    public static void swap(int arr[], int a, int b, int r){ 
        for(int i = 0 ; i < r ; i++){ 
            int temp = arr[a + i]; 
            arr[a + i] = arr[b + i]; 
            arr[b + i] = temp; 
        } 
        
    }
    
    
    public static void leftRotate(int arr[], int r){ 
        int n = arr.length;
        
        
        if(r == 0 || r == n) return; 
        
        int i = r; 
        int j = n - r; 
     
        while (i != j){   
            // A's size is less
            if(i < j){ 
                swap(arr, r-i, r+j-i, i); 
                j = j - i; 
            } 
            // B's size is less
            else{ 
                swap(arr, r-i, r, j); 
                i = i - j; 
            } 
        }
        
        // Finally at the end, block swap elements of A and B
        swap(arr, r-i, r, i); 
    } 
    
    // Main function
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        
        System.out.println("Enter the number of rotations");
        int no_of_rotations = s.nextInt();
        
        leftRotate(arr, no_of_rotations); 
        
        System.out.println("Array Elements after rotating : "); 
        for(int i = 0 ; i < n ; i++){   
            System.out.print(arr[i] + " "); 
        }
    }  
}